package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {

    @Query(value = "SELECT tech FROM Technology tech WHERE tech.name IN (:technologyList) ORDER BY random() ")
    List<Technology> getAllTechnologyWithQuestions(@Param("technologyList") List<String> technologyList);

}
