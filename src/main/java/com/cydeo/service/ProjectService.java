package com.cydeo.service;

import com.cydeo.dto.ProjectDTO;


import java.util.List;

public interface ProjectService {

    ProjectDTO getByProjectCode(String code);
    List<ProjectDTO> listAllProjects();
    void save(ProjectDTO dto);
    void delete(String code);
    void update(ProjectDTO dto);
    void complete(String projectDTO);
    List<ProjectDTO> listAllProjectDetails();



}
