package com.solvd.buildingCompany.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.solvd.buildingCompany.persistence.dao.IProjectRepository;
import com.solvd.buildingCompany.persistence.model.Project;
import com.solvd.buildingCompany.util.MyBatisFactory;

public class ProjectService implements IProjectRepository {

    private final Logger logger = LoggerFactory.getLogger(ProjectService.class);

    private IProjectRepository projectRepository = MyBatisFactory.getSqlSessionFactory()
            .openSession().getMapper(IProjectRepository.class);

    public ProjectService() {
    }

    @Override
    public Project getProjectById(long id) {
        return projectRepository.getProjectById(id);
    }

    @Override
    public Project getProjectByCreatorId(long id) {
        return projectRepository.getProjectByCreatorId(id);
    }

    @Override
    public Project getProjectByAssignedId(long id) {
        return projectRepository.getProjectByAssignedId(id);
    }

    @Override
    public Project getProjectByClientId(long id) {
        return projectRepository.getProjectByClientId(id);
    }

    @Override
    public Project getProjectByName(String name) {
        return projectRepository.getProjectByName(name);
    }

    @Override
    public List<Project> getAllProject() {
        return projectRepository.getAllProject();
    }

    @Override
    public void save(Project project) {
        projectRepository.save(project);
    }

    @Override
    public void update(Project project) {
        projectRepository.update(project);
    }

    @Override
    public void delete(Project project) {
        projectRepository.delete(project);
    }
}
