package fr.beutin.julian.demo.demo.service.impl;


import fr.beutin.julian.demo.demo.entity.Technology;
import fr.beutin.julian.demo.demo.repository.TechnologyRepository;
import fr.beutin.julian.demo.demo.service.GenerateQuestionService;
import org.springframework.stereotype.Service;

@Service
public class GenerateQuestionServiceImpl implements GenerateQuestionService {


    TechnologyRepository technologyRepository;

    public GenerateQuestionServiceImpl(TechnologyRepository technologyRepository) {
        this.technologyRepository = technologyRepository;
    }


    /**
     * @return
     */
    @Override
    public Technology getAllTechnologyWithQuestions(String name, String version) {
        return this.technologyRepository.getAllTechnologyWithQuestions(name, version);
    }
}
