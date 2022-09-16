package com.solvd.buildingCompany.persistence.model;

import java.util.Collection;
import java.util.Date;

public class Salaries {

    private Long id;

    private Collection<Long> staffId;

    private Double salary;

    public Salaries() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Long> getStaffId() {
        return staffId;
    }

    public void setStaffId(Collection<Long> staffId) {
        this.staffId = staffId;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}
