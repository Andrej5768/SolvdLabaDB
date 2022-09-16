package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Address;

public interface IAddressRepository {

    Address findById(long id);
}
