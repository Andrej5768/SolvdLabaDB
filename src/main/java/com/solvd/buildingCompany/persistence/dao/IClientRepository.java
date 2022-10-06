package com.solvd.buildingCompany.persistence.dao;

import java.util.List;

import com.solvd.buildingCompany.persistence.model.Client;

public interface IClientRepository {

    Client getClientByName(String name);

    Client getClientById(long id);

    List<Client> getAllClients();
}
