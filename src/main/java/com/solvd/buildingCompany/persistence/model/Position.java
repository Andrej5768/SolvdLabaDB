package com.solvd.buildingCompany.persistence.model;

import java.util.Collection;

public class Position {

    private Long id;

    private String name;

    private Collection<Long> staffId;

    public Position() {
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

    public Collection<Long> getStaffId() {
        return staffId;
    }

    public void setStaffId(Collection<Long> staffId) {
        this.staffId = staffId;
    }
}
