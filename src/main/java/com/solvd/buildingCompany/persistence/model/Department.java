package com.solvd.buildingCompany.persistence.model;

import java.util.Collection;

public class Department {

    private Long id;

    private String name;

    private String remark;

    private Collection<Long> staffId;

    public Department() {
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

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Collection<Long> getStaffId() {
        return staffId;
    }

    public void setStaffId(Collection<Long> staffId) {
        this.staffId = staffId;
    }
}
