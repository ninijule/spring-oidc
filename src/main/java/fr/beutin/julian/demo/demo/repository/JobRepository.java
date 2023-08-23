package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {

    @Query("SELECT jb FROM Job jb")
    List<Job> getAllJob();
}
