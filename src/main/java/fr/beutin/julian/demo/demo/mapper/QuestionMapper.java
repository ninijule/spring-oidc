package fr.beutin.julian.demo.demo.mapper;


import fr.beutin.julian.demo.demo.dto.MovieDTO;
import fr.beutin.julian.demo.demo.entity.User;
import org.mapstruct.Mapper;


import java.util.List;

@Mapper(componentModel = "spring")
public interface QuestionMapper {

    List<MovieDTO> map(List<User> movie);

}
