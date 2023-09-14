package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Technology;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnologyRepository extends JpaRepository<Technology, Long> {


}
