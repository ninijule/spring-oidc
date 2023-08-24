package fr.beutin.julian.demo.demo.controller;

import fr.beutin.julian.demo.demo.dto.JobDTO;
import fr.beutin.julian.demo.demo.entity.Job;
import fr.beutin.julian.demo.demo.mapper.JobMapper;
import fr.beutin.julian.demo.demo.service.JobService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/job")
public class JobController {

    private final JobService jobService;

    private final JobMapper jobMapper;

    public JobController(JobService jobService, JobMapper jobMapper) {
        this.jobService = jobService;
        this.jobMapper = jobMapper;
    }

    @GetMapping("")
    public ResponseEntity<List<JobDTO>> getAllJobs(){
        List<Job> job = jobService.getAllJob();
       return new ResponseEntity<>(jobMapper.map(job), HttpStatus.OK);
    }
}
