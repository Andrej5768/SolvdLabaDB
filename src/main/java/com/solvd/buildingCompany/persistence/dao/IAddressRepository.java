package com.solvd.buildingCompany.persistence.dao;

import java.util.List;

import com.solvd.buildingCompany.persistence.model.Address;

public interface IAddressRepository {

    Address getAddressById(Long id);

    List<Address> getAllAddress();
}
