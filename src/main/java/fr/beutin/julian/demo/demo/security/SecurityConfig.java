package fr.beutin.julian.demo.demo.security;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.beutin.julian.demo.demo.dto.TokenAuth;
import fr.beutin.julian.demo.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.session.SessionRegistryImpl;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.session.RegisterSessionAuthenticationStrategy;
import org.springframework.security.web.authentication.session.SessionAuthenticationStrategy;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Base64;


@CrossOrigin
@Configuration
@EnableWebSecurity
class SecurityConfig {

    private final Logger logger = LoggerFactory.getLogger(SecurityConfig.class);

    private final UserService userService;

    SecurityConfig(UserService userService) {

        this.userService = userService;
    }

    @Bean
    protected SessionAuthenticationStrategy sessionAuthenticationStrategy() {
        return new RegisterSessionAuthenticationStrategy(new SessionRegistryImpl());
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.csrf(AbstractHttpConfigurer::disable).authorizeHttpRequests(authorize ->
                authorize.requestMatchers("/*").authenticated());

        httpSecurity.oauth2ResourceServer().jwt(jwt -> jwt.authenticationManager(authentication -> {
            Object token = authentication.getPrincipal();
            ObjectMapper objectMapper = new ObjectMapper();

            logger.info(" donnée de l'utilisateur : {}", authentication.getPrincipal());

            Base64.Decoder decoder = Base64.getUrlDecoder();
            String[] chunks = token.toString().split("\\.");

            logger.info("Données du chunk : {} ", new String(decoder.decode(chunks[1])));

            TokenAuth tokenAuth;
            try {
                tokenAuth = objectMapper.readValue(new String(decoder.decode(chunks[1])), TokenAuth.class);
            } catch (JsonProcessingException e) {
                throw new RuntimeException(e);
            }

            logger.info(tokenAuth.getEmail());


            return authentication;
        }));


        return httpSecurity.build();
    }


}