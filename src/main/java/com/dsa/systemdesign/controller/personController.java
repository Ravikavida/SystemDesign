package com.dsa.systemdesign.controller;

import org.springframework.batch.core.job.Job;
import org.springframework.batch.core.job.JobExecution;
import org.springframework.batch.core.job.parameters.InvalidJobParametersException;
import org.springframework.batch.core.job.parameters.JobParameters;
import org.springframework.batch.core.job.parameters.JobParametersBuilder;
import org.springframework.batch.core.launch.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.launch.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.launch.JobOperator;
import org.springframework.batch.core.launch.JobRestartException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/springbatch")
public class personController {

    @Autowired
    private JobOperator operator;

    @Autowired
    private Job job;

    @PostMapping("/importdata")
    public String jobLauncher(){

        final JobParameters jobParameter = new JobParametersBuilder()
                     .addLong("StartAt",System.currentTimeMillis()).toJobParameters();

        try{
            JobExecution jobExecution = operator.start(job,jobParameter);
            return jobExecution.getStatus().toString();
        } catch (JobInstanceAlreadyCompleteException | InvalidJobParametersException |
                 JobExecutionAlreadyRunningException | JobRestartException e) {
            throw new RuntimeException(e);
        }


    }
}
