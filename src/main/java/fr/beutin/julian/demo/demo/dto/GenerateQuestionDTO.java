package fr.beutin.julian.demo.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class GenerateQuestionDTO {

    List<Long> skillIdList = new ArrayList<>();


    public List<Long> getSkillIdList() {
        return skillIdList;
    }

    public void setSkillIdList(List<Long> skillIdList) {
        this.skillIdList = skillIdList;
    }

}
