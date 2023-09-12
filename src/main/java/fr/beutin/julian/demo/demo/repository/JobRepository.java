package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<Job, Long> {



}
