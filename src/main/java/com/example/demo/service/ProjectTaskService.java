package com.example.demo.service;

import com.example.demo.domain.ProjectTask;
import com.example.demo.repository.ProjectTaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskService  {

    private final ProjectTaskRepository taskRepository;

    public ProjectTaskService(ProjectTaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public ResponseEntity<?> insertTaskProject(ProjectTask projectTask){
        if (projectTask.getStatus() == null || projectTask.getStatus().isEmpty())
            projectTask.setStatus("To-Do");
        return new ResponseEntity<>(taskRepository.save(projectTask), HttpStatus.CREATED);
    }
}
