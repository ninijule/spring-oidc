package fr.beutin.julian.demo.demo.mapper;

import fr.beutin.julian.demo.demo.dto.job.JobDTO;
import fr.beutin.julian.demo.demo.entity.Job;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring", unmappedSourcePolicy = ReportingPolicy.WARN)
public interface JobMapper {

    List<JobDTO> mapToListJobDTO(List<Job> job);

 }
