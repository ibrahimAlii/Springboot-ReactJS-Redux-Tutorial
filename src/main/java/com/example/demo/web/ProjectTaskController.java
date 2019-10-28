package com.example.demo.web;


import com.example.demo.domain.ProjectTask;
import com.example.demo.service.ProjectTaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("api/board")
@CrossOrigin
public class ProjectTaskController {

    private final ProjectTaskService taskService;

    public ProjectTaskController(ProjectTaskService taskService) {
        this.taskService = taskService;
    }

    @RequestMapping
    public ResponseEntity<?> insertProjectTask(@Valid @RequestBody ProjectTask projectTask){
        return taskService.insertTaskProject(projectTask);
    }

    @GetMapping("/all")
    public Iterable<ProjectTask> getAllProjects(){
        return taskService.getAllTasks();
    }

    @GetMapping("/{project_id}")
    public ResponseEntity<ProjectTask> getProjectById(@PathVariable Long project_id){
        return taskService.getProjectById(project_id);
    }
}
