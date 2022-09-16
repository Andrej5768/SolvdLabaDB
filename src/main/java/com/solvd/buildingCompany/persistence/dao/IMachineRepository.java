package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Machine;

public interface IMachineRepository {

    Machine findByName(String name);

    Machine findById(long id);
}
