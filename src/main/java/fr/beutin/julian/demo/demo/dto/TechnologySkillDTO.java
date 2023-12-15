package fr.beutin.julian.demo.demo.dto;

import java.util.ArrayList;
import java.util.List;

public class TechnologySkillDTO {

    public List<Long> getSkillIdList() {
        return skillIdList;
    }

    public void setSkillIdList(List<Long> skillIdList) {
        this.skillIdList = skillIdList;
    }

    List<Long> skillIdList = new ArrayList<>();
}
