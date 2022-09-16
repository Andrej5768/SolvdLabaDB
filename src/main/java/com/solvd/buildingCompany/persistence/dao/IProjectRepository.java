package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Project;

import java.util.List;

public interface IProjectRepository {

    Project findByName(String name);

    List<Project> findAll();

    Project findById(long id);
}
