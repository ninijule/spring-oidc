package fr.beutin.julian.demo.demo.service;


import fr.beutin.julian.demo.demo.entity.Skill;
import fr.beutin.julian.demo.demo.entity.Technology;

import java.util.List;

public interface SkillService {


    List<Skill> getSkillsbyJobId(Long jobId);

    List<Technology> getTechnologyBySkillId(String skillId);


}
