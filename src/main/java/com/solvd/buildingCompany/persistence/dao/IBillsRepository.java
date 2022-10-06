package com.solvd.buildingCompany.persistence.dao;

import java.util.List;

import com.solvd.buildingCompany.persistence.model.Bills;

public interface IBillsRepository {

    Bills getBillById(long id);

    List<Bills> getAllBills();
}
