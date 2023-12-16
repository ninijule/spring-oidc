package fr.beutin.julian.demo.demo.controller;


import fr.beutin.julian.demo.demo.dto.TechnologyDTO;
import fr.beutin.julian.demo.demo.dto.TechnologySkillDTO;
import fr.beutin.julian.demo.demo.entity.Technology;
import fr.beutin.julian.demo.demo.mapper.TechnologyMapper;
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

    private final TechnologyMapper technologyMapper;

    public TechnologyController(SkillService skillService,
                                TechnologyMapper technologyMapper) {
        this.skillService = skillService;
        this.technologyMapper = technologyMapper;
    }


    @PostMapping("")
    public ResponseEntity<List<TechnologyDTO>> getTechnologiesbySkillId(@RequestBody TechnologySkillDTO skillIdList) {
        List<Technology> technologyList = skillService.getTechnologyBySkillId(skillIdList.getSkillIdList());
        return new ResponseEntity<>(technologyMapper.mapToListTechnologyDTO(technologyList), HttpStatus.OK);
    }




}
