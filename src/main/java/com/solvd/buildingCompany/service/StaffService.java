package com.solvd.buildingCompany.service;

import com.solvd.buildingCompany.persistence.dao.IStaffRepository;
import com.solvd.buildingCompany.persistence.model.Staff;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class StaffService implements IStaffRepository {

    private final Logger logger = LoggerFactory.getLogger(StaffService.class);

    @Override
    public Staff getStaffById(long id) {
        return null;
    }

    @Override
    public List<Staff> getAll() {
        return null;
    }

    @Override
    public void save(Staff staff) {

    }

    @Override
    public void update(Staff staff, String[] params) {

    }

    @Override
    public void delete(Staff staff) {

    }
}
