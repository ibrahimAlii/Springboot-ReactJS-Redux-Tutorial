package com.example.demo.service;

import com.example.demo.domain.ProjectTask;
import com.example.demo.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService  {

    @Autowired
    private ProjectTaskRepository taskRepository;
}
