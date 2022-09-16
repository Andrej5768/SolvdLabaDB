package com.solvd.buildingCompany.service;

import com.solvd.buildingCompany.persistence.model.Project;
import com.solvd.buildingCompany.persistence.dao.IProjectRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class ProjectService implements IProjectRepository {

    private final Logger logger = LoggerFactory.getLogger(ProjectService.class);

    @Override
    public Project findByName(String name) {
        return null;
    }

    @Override
    public List<Project> findAll() {
        return null;
    }

    @Override
    public Project findById(long id) {
        return null;
    }


}
