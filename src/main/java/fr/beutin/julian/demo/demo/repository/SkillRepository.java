package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SkillRepository extends JpaRepository<Skill, Long> {

    @Query(value = "SELECT jb.skills FROM Job as jb WHERE jb.id = :jobId")
    List<Skill> getSkillsbyJobId(@Param("jobId") Long jobId);

}
