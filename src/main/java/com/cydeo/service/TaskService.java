package com.cydeo.service;

import com.cydeo.dto.TaskDTO;
import com.cydeo.entity.Task;

import java.util.List;

public interface TaskService  {

    List<TaskDTO> listAllTasks();
    TaskDTO findById(Long id);
    void updateTask(TaskDTO dto);
    void save(TaskDTO dto);
    void delete(Long id);
    int totalNonCompletedTask(String projectCode);
    int totalCompletedTask(String projectCode);

}
