package fr.beutin.julian.demo.demo.dto.job;

import fr.beutin.julian.demo.demo.dto.SkillDTO;

import java.util.List;

public class JobWithSkillAssociatedDTO {

    private List<SkillDTO> skillsList;

    public List<SkillDTO> getSkillsList() {
        return skillsList;
    }

    public void setSkillsList(List<SkillDTO> skillsList) {
        this.skillsList = skillsList;
    }
}
