package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Department;

public interface IDeptRepository {

    Department findDeptById(long id);
}
