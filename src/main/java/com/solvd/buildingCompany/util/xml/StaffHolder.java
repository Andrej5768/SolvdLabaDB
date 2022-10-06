package com.solvd.buildingCompany.util.xml;

import com.solvd.buildingCompany.persistence.model.Staff;
import jakarta.xml.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "list-staff")
public class StaffHolder {

    private List<Staff> staffList = new ArrayList<>();

    public StaffHolder() {
    }

    public StaffHolder(List<Staff> staffList) {
        this.staffList = staffList;
    }

    public List<Staff> getStaffList() {
        return staffList;
    }

    @XmlElement(name = "Staff", type = Staff.class)
    public void setStaffList(List<Staff> staffList) {
        this.staffList = staffList;
    }
}