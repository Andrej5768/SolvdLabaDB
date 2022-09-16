package com.solvd.buildingCompany.persistence.model;

import java.util.Collection;
import java.util.Objects;

public class Client {

    private Long id;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    private String companyName;

    private Collection<Long> projectsId;

    private Collection<Long> billsId;

    public Client() {
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Collection<Long> getProjectsId() {
        return projectsId;
    }

    public void setProjectsId(Collection<Long> projectsId) {
        this.projectsId = projectsId;
    }

    public Collection<Long> getBillsId() {
        return billsId;
    }

    public void setBillsId(Collection<Long> billsId) {
        this.billsId = billsId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(id, client.id)
                && Objects.equals(firstName, client.firstName)
                && Objects.equals(lastName, client.lastName)
                && Objects.equals(phoneNumber, client.phoneNumber)
                && Objects.equals(companyName, client.companyName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, lastName, phoneNumber, companyName);
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
