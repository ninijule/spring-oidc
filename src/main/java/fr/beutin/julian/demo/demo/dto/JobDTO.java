package fr.beutin.julian.demo.demo.dto;


import java.util.ArrayList;
import java.util.List;

public class JobDTO {

    private String name;
    private String description;
    private List<SkillDTO> skillDTOS = new ArrayList<>();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<SkillDTO> getSkills() {
        return skillDTOS;
    }

    public void setSkills(List<SkillDTO> skillDTOS) {
        this.skillDTOS = skillDTOS;
    }
}
