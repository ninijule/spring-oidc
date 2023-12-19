package fr.beutin.julian.demo.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class GenerateQuestionDTO {

    private List<String> technologyList = new ArrayList<>();

    private Long numberOfQuestions;


    public List<String> getTechnologyList() {
        return technologyList;
    }

    public void setTechnologyList(List<String> technologyList) {
        this.technologyList = technologyList;
    }

    public Long getNumberOfQuestions() {
        return numberOfQuestions;
    }

    public void setNumberOfQuestions(Long numberOfQuestions) {
        this.numberOfQuestions = numberOfQuestions;
    }
}
