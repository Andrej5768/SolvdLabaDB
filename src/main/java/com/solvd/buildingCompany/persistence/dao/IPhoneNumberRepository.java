package com.solvd.buildingCompany.persistence.dao;

import com.solvd.buildingCompany.persistence.model.PhoneNumber;

public interface IPhoneNumberRepository {

    PhoneNumber findStaffPhoneNumber(String phoneNumber);

    PhoneNumber findById(long id);
}

