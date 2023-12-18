package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {


    @Query(value = "SELECT qu.id, qu.answer, qu.ask, qu.entity_version, qu.level, tech.id as technology_id  FROM question qu inner join technology tech on tech.id = qu.id WHERE tech.id IN (:skillsList)", nativeQuery = true)
    List<Question> getAllQuestionBySKillId(@Param("skillsList") List<Long> skillsList);
}
