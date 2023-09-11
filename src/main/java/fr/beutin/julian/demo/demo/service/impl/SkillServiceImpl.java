package fr.beutin.julian.demo.demo.service.impl;


import fr.beutin.julian.demo.demo.repository.SkillRepository;
import fr.beutin.julian.demo.demo.service.SkillService;
import org.springframework.stereotype.Service;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }


}
