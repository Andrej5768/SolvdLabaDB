package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Crew;

public interface ICrewRepository {

    Crew findById(long id);
}
