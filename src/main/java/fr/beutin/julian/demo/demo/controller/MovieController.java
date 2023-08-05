package fr.beutin.julian.demo.demo.controller;

import fr.beutin.julian.demo.demo.service.UserService;
import fr.beutin.julian.demo.demo.dto.MovieDTO;
import fr.beutin.julian.demo.demo.mapper.MovieMapper;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/movie")
public class MovieController {


    private final UserService userService;

    private final MovieMapper movieMapper;

    public MovieController(UserService userService, MovieMapper movieMapper) {
        this.userService = userService;
        this.movieMapper = movieMapper;
    }

    @GetMapping("")
    public List<MovieDTO> getAllMovies() {
        return movieMapper.map(userService.getMovie());
    }

}
