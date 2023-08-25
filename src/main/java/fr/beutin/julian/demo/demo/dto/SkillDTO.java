package fr.beutin.julian.demo.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class SkillDTO {

    private String name;

    private String description;

    private List<TechnologyDTO> technology = new ArrayList<>();

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

    public List<TechnologyDTO> getTechnology() {
        return technology;
    }

    public void setTechnology(List<TechnologyDTO> technology) {
        this.technology = technology;
    }
}
