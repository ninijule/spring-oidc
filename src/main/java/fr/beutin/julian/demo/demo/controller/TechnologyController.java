package fr.beutin.julian.demo.demo.controller;


import fr.beutin.julian.demo.demo.dto.TechnologySkillDTO;
import fr.beutin.julian.demo.demo.entity.Technology;
import fr.beutin.julian.demo.demo.service.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping(path = "/technology")
public class TechnologyController {

    private final SkillService skillService;

    public TechnologyController(SkillService skillService) {
        this.skillService = skillService;
    }


    @PostMapping("")
    public ResponseEntity<List<Technology>> getTechnologiesbySkillId(@RequestBody TechnologySkillDTO skillIdList) {
        List<Technology> technologyList = skillService.getTechnologyBySkillId(skillIdList.getSkillIdList());
        return new ResponseEntity<>(technologyList, HttpStatus.OK);
    }




}
