package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    @Query(value = "SELECT jb.id, jb.name, jb.description FROM Job as jb", nativeQuery = true)
    List<Job> getAllJobs();
}
