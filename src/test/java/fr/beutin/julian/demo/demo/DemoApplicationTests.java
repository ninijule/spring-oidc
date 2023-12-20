package fr.beutin.julian.demo.demo;

import fr.beutin.julian.demo.demo.controller.GenerateQuestionController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private GenerateQuestionController generateQuestionController;
	@Test
	void contextLoads() {
		assertThat(generateQuestionController).isNotNull();
	}

}
