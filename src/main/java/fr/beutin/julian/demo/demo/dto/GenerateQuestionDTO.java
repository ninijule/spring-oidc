package fr.beutin.julian.demo.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class GenerateQuestionDTO {

    private List<TechnologyDTO> technologyList = new ArrayList<>();

    public List<TechnologyDTO> getTechnologyList() {
        return technologyList;
    }

    public void setTechnologyList(List<TechnologyDTO> technologyList) {
        this.technologyList = technologyList;
    }

}
