package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Salaries;

public interface ISalariesRepository {

    Salaries findById(long id);
}
