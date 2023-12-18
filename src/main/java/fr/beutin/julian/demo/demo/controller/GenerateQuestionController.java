package fr.beutin.julian.demo.demo.controller;

import fr.beutin.julian.demo.demo.dto.GenerateQuestionDTO;
import fr.beutin.julian.demo.demo.entity.Question;
import fr.beutin.julian.demo.demo.mapper.QuestionMapper;
import fr.beutin.julian.demo.demo.service.GenerateQuestionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/generate-question")
public class GenerateQuestionController {

    private final GenerateQuestionService generateQuestionService;

    private final QuestionMapper questionMapper;


    public GenerateQuestionController(GenerateQuestionService generateQuestionService,
                                      QuestionMapper questionMapper) {
        this.generateQuestionService = generateQuestionService;
        this.questionMapper = questionMapper;
    }


    @PostMapping("")
    public ResponseEntity generateRandomQuestions(@RequestBody GenerateQuestionDTO generateQuestionDTO) {
        List<Question> questionList = generateQuestionService.getAllQuestions(generateQuestionDTO.getSkillIdList());
        return new ResponseEntity<>(questionMapper.mapToListQuestionDTO(questionList), HttpStatus.OK);
    }
}
