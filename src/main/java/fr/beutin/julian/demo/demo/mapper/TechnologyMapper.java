package fr.beutin.julian.demo.demo.mapper;

import fr.beutin.julian.demo.demo.dto.TechnologyDTO;
import fr.beutin.julian.demo.demo.entity.Technology;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.WARN)
public interface TechnologyMapper {

    List<TechnologyDTO> mapToListTechnologyDTO(List<Technology> technologies);

 }
