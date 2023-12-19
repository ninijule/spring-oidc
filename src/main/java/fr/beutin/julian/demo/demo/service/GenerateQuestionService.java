package fr.beutin.julian.demo.demo.service;

import fr.beutin.julian.demo.demo.entity.Technology;

import java.util.List;

public interface GenerateQuestionService {

     List<Technology> getAllTechnologyWithQuestions(List<String> technologyList, Long numberOfQuestion);

}
