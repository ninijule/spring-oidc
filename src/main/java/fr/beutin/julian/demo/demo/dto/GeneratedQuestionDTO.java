package fr.beutin.julian.demo.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class GeneratedQuestionDTO {



    private String name;
    private String description;
    private String version;

    private List<QuestionDTO> questions = new ArrayList<>();



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

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }


    public List<QuestionDTO> getQuestions() {
        return questions;
    }

    public void setQuestions(List<QuestionDTO> questions) {
        this.questions = questions;
    }
}
