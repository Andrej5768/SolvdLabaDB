package com.solvd.buildingCompany.persistence.dao;

import java.util.List;

import com.solvd.buildingCompany.persistence.model.Staff;

public interface IStaffRepository {

    Staff getStaffById(long id);

    List<Staff> getAllStaff();

    void save(Staff staff);

    void update(Staff staff);

    void delete(Staff staff);
}
