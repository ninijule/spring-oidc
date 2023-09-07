package fr.beutin.julian.demo.demo.mapper;

import fr.beutin.julian.demo.demo.dto.SkillDTO;
import fr.beutin.julian.demo.demo.entity.Skill;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.WARN)

public interface SkillMapper {

    List<SkillDTO> map(List<Skill> skills);
}



