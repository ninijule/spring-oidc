package fr.beutin.julian.demo.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "job")
public class Job extends AbstractEntity {

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;

    @ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinTable(name = "job_skills", joinColumns = {@JoinColumn(name = "job_id")}, inverseJoinColumns = {@JoinColumn(name = "skills_id")})
    @JsonIgnore
    private Set<Skill> skills = new HashSet<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public Set<Skill> getSkills() {
        return skills;
    }

    public void setSkills(Set<Skill> skills) {
        this.skills = skills;
    }
}
