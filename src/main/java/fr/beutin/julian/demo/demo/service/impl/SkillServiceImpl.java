package fr.beutin.julian.demo.demo.service.impl;


import fr.beutin.julian.demo.demo.entity.Skill;
import fr.beutin.julian.demo.demo.entity.Technology;
import fr.beutin.julian.demo.demo.repository.SkillRepository;
import fr.beutin.julian.demo.demo.service.SkillService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillServiceImpl implements SkillService {

    private final SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }



    /**
     * @param jobId
     * @return
     */
    @Override
    public List<Skill> getSkillsbyJobId(Long jobId) {
        return this.skillRepository.getSkillsbyJobId(jobId);
    }

    /**
     * @param skillId
     * @return
     */
    @Override
    public List<Technology> getTechnologyBySkillId(List<Long> skillId) {
        return this.skillRepository.getTechnologiesBySkillId(skillId);
    }


}
