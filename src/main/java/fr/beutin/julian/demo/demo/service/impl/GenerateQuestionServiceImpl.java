package fr.beutin.julian.demo.demo.service.impl;


import fr.beutin.julian.demo.demo.entity.Question;
import fr.beutin.julian.demo.demo.repository.QuestionRepository;
import fr.beutin.julian.demo.demo.service.GenerateQuestionService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GenerateQuestionServiceImpl implements GenerateQuestionService {


    QuestionRepository questionRepository;

    public GenerateQuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }


    /**
     * @return
     */
    @Override
    public List<Question> getAllQuestions(List<Long> skillId) {
        return this.questionRepository.getAllQuestionBySKillId(skillId);
    }
}
