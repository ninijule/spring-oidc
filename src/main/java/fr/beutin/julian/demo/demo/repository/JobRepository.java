package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    @Query(value = "SELECT jb.skills FROM Job as jb WHERE jb.id = :jobId")
    Job getSkillsbyJobId(@Param("jobId") Long jobId);


}
