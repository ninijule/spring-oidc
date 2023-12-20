package fr.beutin.julian.demo.demo.controller;

import fr.beutin.julian.demo.demo.dto.GenerateQuestionDTO;
import fr.beutin.julian.demo.demo.dto.GeneratedQuestionDTO;
import fr.beutin.julian.demo.demo.dto.TechnologyDTO;
import fr.beutin.julian.demo.demo.entity.Technology;
import fr.beutin.julian.demo.demo.mapper.GeneratedQuestionMapper;
import fr.beutin.julian.demo.demo.service.GenerateQuestionService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/generate-question")
public class GenerateQuestionController {

    private final GenerateQuestionService generateQuestionService;

    private final GeneratedQuestionMapper generatedQuestionMapper;


    public GenerateQuestionController(GenerateQuestionService generateQuestionService,
                                      GeneratedQuestionMapper generatedQuestionMapper) {
        this.generateQuestionService = generateQuestionService;
        this.generatedQuestionMapper = generatedQuestionMapper;
    }


    @PostMapping("")
    public ResponseEntity<List<GeneratedQuestionDTO>> generateRandomQuestions(@Valid @RequestBody GenerateQuestionDTO generateQuestionDTO) {
        List<Technology> technologyList = new ArrayList<>();
        for (TechnologyDTO tech : generateQuestionDTO.getTechnologyList()) {
            technologyList.add(generateQuestionService.getAllTechnologyWithQuestions(tech.getName(), tech.getVersion()));
        }

        return new ResponseEntity<>(generatedQuestionMapper.mapToListGeneratedQuestionDTO(technologyList), HttpStatus.OK);
    }
}
