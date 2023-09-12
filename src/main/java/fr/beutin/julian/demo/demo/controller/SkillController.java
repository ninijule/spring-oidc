package fr.beutin.julian.demo.demo.controller;

import fr.beutin.julian.demo.demo.dto.SkillDTO;
import fr.beutin.julian.demo.demo.entity.Skill;
import fr.beutin.julian.demo.demo.mapper.SkillMapper;
import fr.beutin.julian.demo.demo.service.SkillService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/skill")
public class SkillController {

    private final SkillService skillService;

    private final SkillMapper skillMapper;

    public SkillController(SkillService skillService, SkillMapper skillMapper) {
        this.skillService = skillService;
        this.skillMapper = skillMapper;
    }

    @GetMapping("/{jobId}")
    public ResponseEntity<List<SkillDTO>> getSkillsbyJobId(@PathVariable Long jobId) {
        List<Skill> skillList = skillService.getSkillsbyJobId(jobId);
        return new ResponseEntity<>(skillMapper.toSkillDTO(skillList), HttpStatus.OK);
    }


}
