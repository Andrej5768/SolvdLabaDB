package com.solvd.buildingCompany.persistence.model;

import java.util.Date;
import java.util.Objects;

public class Project {

    private Long id;

    private String name;

    private Long assignedTo;

    private Long createBy;

    private Date createDate;

    private Date endDate;

    private Long clientId;

    public Project() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(Long assignedTo) {
        this.assignedTo = assignedTo;
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getClientId() {
        return clientId;
    }

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Project project = (Project) o;
        return Objects.equals(id, project.id)
                && Objects.equals(name, project.name)
                && Objects.equals(createDate, project.createDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, createDate);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", assignedTo=" + assignedTo +
                ", createBy=" + createBy +
                ", createDate=" + createDate +
                ", endDate=" + endDate +
                ", clientId=" + clientId +
                '}';
    }
}
