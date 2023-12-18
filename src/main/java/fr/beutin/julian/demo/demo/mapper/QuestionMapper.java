package fr.beutin.julian.demo.demo.mapper;

import fr.beutin.julian.demo.demo.dto.QuestionDTO;
import fr.beutin.julian.demo.demo.entity.Question;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.WARN)
public interface QuestionMapper {

    List<QuestionDTO> mapToListQuestionDTO(List<Question> questions);

 }
