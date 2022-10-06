package com.solvd.buildingCompany.persistence.dao;

import java.util.List;

import com.solvd.buildingCompany.persistence.model.Project;

public interface IProjectRepository {

    Project getProjectById(long id);

    Project getProjectByCreatorId(long id);

    Project getProjectByAssignedId(long id);

    Project getProjectByClientId(long id);

    Project getProjectByName(String name);

    List<Project> getAllProject();

    void save(Project project);

    void update(Project project);

    void delete(Project project);

}
