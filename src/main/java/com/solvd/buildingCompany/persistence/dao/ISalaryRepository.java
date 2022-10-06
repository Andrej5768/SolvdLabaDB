package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Salary;

public interface ISalaryRepository {

    Salary getSalaryById(long id);
}
