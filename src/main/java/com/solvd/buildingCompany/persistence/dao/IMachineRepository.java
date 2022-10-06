package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Machine;

public interface IMachineRepository {

    Machine getMachineByName(String name);

    Machine getMachineById(long id);
}
