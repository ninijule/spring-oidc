package fr.beutin.julian.demo.demo.service;

import fr.beutin.julian.demo.demo.entity.Technology;


public interface GenerateQuestionService {

     Technology getAllTechnologyWithQuestions(String name, String version);

}
