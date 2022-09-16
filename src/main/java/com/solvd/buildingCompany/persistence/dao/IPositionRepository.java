package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Position;

public interface IPositionRepository {

    Position findById(long id);
}
