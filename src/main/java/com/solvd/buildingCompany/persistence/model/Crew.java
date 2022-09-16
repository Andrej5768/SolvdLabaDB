package com.solvd.buildingCompany.persistence.model;

import java.util.Collection;

public class Crew {

    private Long id;

    private Collection<Long> machinesId;

    private Collection<Long> staffId;

    public Crew() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Collection<Long> getMachinesId() {
        return machinesId;
    }

    public void setMachinesId(Collection<Long> machinesId) {
        this.machinesId = machinesId;
    }

    public Collection<Long> getStaffId() {
        return staffId;
    }

    public void setStaffId(Collection<Long> staffId) {
        this.staffId = staffId;
    }
}
