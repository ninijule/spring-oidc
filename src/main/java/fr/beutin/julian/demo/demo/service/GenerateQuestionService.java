package fr.beutin.julian.demo.demo.service;

import fr.beutin.julian.demo.demo.entity.Question;

import java.util.List;

public interface GenerateQuestionService {

     List<Question> getAllQuestions(List<Long> skillId);

}
