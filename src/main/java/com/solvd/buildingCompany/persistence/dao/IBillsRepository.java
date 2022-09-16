package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Bills;

public interface IBillsRepository {

    Bills findById(long id);
}
