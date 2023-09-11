package fr.beutin.julian.demo.demo.service.impl;


import fr.beutin.julian.demo.demo.entity.Job;
import fr.beutin.julian.demo.demo.repository.JobRepository;
import fr.beutin.julian.demo.demo.service.JobService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobServiceImpl implements JobService {

    private final JobRepository jobRepository;

    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    public List<Job> getAllJobs(){
        return this.jobRepository.findAll();
    }

    /**
     * @param jobId
     * @return
     */
    @Override
    public Job getSkillsbyJobId(Long jobId) {
        return this.jobRepository.getSkillsbyJobId(jobId);
    }

}
