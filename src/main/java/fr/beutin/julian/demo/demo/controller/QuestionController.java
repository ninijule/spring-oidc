package fr.beutin.julian.demo.demo.controller;

import fr.beutin.julian.demo.demo.mapper.QuestionMapper;
import fr.beutin.julian.demo.demo.service.UserService;
import fr.beutin.julian.demo.demo.dto.MovieDTO;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "/question")
public class QuestionController {


    private final UserService userService;

    private final QuestionMapper questionMapper;

    public QuestionController(UserService userService, QuestionMapper questionMapper) {
        this.userService = userService;
        this.questionMapper = questionMapper;
    }

    @GetMapping("")
    public List<MovieDTO> getQuestions() {
        return questionMapper.map(userService.getMovie());

    }

}
