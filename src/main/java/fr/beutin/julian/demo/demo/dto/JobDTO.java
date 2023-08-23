package fr.beutin.julian.demo.demo.dto;


import java.util.ArrayList;
import java.util.List;

public class JobDTO {

    private String name;
    private String description;
    private List<Skill> skills = new ArrayList<>();


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

    public List<Skill> getSkills() {
        return skills;
    }

    public void setSkills(List<Skill> skills) {
        this.skills = skills;
    }
}
