package com.solvd.buildingCompany.persistence.model;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

public class Staff {

    private Long id;

    private String firstName;

    private String lastName;

    private Date startDate;

    private Date endDate;

    private Long addressId;

    private Long phoneNumberId;

    private Collection<Long> projectsId;

    private Collection<Long> projectCreatedId;

    public Staff() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getPhoneNumberId() {
        return phoneNumberId;
    }

    public void setPhoneNumberId(Long phoneNumberId) {
        this.phoneNumberId = phoneNumberId;
    }

    public Collection<Long> getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Collection<Long> projectsId) {
        this.projectsId = projectsId;
    }

    public Collection<Long> getProjectCreatedId() {
        return projectCreatedId;
    }

    public void setProjectCreatedId(Collection<Long> projectCreatedId) {
        this.projectCreatedId = projectCreatedId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(id, staff.id)
                && Objects.equals(firstName, staff.firstName)
                && Objects.equals(lastName, staff.lastName)
                && Objects.equals(startDate, staff.startDate)
                && Objects.equals(endDate, staff.endDate)
                && Objects.equals(addressId, staff.addressId)
                && Objects.equals(phoneNumberId, staff.phoneNumberId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, startDate, endDate, addressId, phoneNumberId);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", addressId=" + addressId +
                ", phoneNumberId=" + phoneNumberId +
                '}';
    }
}
