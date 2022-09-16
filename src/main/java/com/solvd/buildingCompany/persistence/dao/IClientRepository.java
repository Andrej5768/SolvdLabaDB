package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.Client;

public interface IClientRepository {

    Client findByName(String name);

    Client findById(long id);
}
