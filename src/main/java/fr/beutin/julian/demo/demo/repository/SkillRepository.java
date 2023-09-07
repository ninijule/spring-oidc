package fr.beutin.julian.demo.demo.repository;

import fr.beutin.julian.demo.demo.entity.Skill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRepository extends JpaRepository<Skill, Long> {
}
