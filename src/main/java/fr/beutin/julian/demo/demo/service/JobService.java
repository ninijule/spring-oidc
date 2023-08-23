package fr.beutin.julian.demo.demo.service;

import fr.beutin.julian.demo.demo.entity.Job;
import fr.beutin.julian.demo.demo.repository.JobRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobService {

    private final JobRepository jobRepository;

    public JobService(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJob() {
        return this.jobRepository.findAll();
    }
}
