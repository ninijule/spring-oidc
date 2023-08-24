package fr.beutin.julian.demo.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class SkillDTO {

    private String name;

    private List<TechnologyDTO> technologyDTOS = new ArrayList<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TechnologyDTO> getTechnologyDTOS() {
        return technologyDTOS;
    }

    public void setTechnologyDTOS(List<TechnologyDTO> technologyDTOS) {
        this.technologyDTOS = technologyDTOS;
    }
}
