package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Staff;

import java.util.List;

public interface IStaffRepository {

    Staff getStaffById(long id);

    List<Staff> getAll();

    void save(Staff staff);

    void update(Staff staff, String[] params);

    void delete(Staff staff);
}
