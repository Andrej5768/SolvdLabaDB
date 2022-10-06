package com.solvd.buildingCompany.persistence.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonRootName;

import jakarta.xml.bind.annotation.*;

import com.solvd.buildingCompany.service.StaffService;

@XmlRootElement(name = "Staff")
@XmlAccessorType(XmlAccessType.FIELD)
@JsonRootName(value = "Staff")
public class Staff {

    @XmlElement(name = "ID")
    private Long id;

    @XmlElement(name = "firstName")
    private String firstName;

    @XmlElement(name = "lastName")
    private String lastName;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @XmlElement(name = "startDate")
    private Date startDate;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @XmlElement(name = "endDate")
    private Date endDate;

    @XmlElement(name = "departmentId")
    private Long deptId;

    @XmlElement(name = "positionId")
    private Long posId;

    @XmlElement(name = "addressId")
    private Long addressId;

    @XmlElement(name = "phoneNumberId")
    private Long phoneNumberId;

    @XmlElementWrapper(name = "AssignedProjects")
    @XmlElement(name = "Project")
    private Collection<Project> assignedProjects;

    @XmlElementWrapper(name = "CreatedProjects")
    @XmlElement(name = "Project")
    private Collection<Project> createdProjects;

    @XmlElement(name = "salariesId")
    private Long salariesId;

    public Staff() {
    }

    public Staff(String firstName, String lastName, Date startDate, Long deptId, Long posId, Long addressId, Long phoneNumberId, Long salariesId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.deptId = deptId;
        this.posId = posId;
        this.addressId = addressId;
        this.phoneNumberId = phoneNumberId;
        this.assignedProjects = new ArrayList<>();
        this.createdProjects = new ArrayList<>();
        this.salariesId = salariesId;
    }

    public Staff(Long id, String firstName, String lastName, Date startDate, Long deptId, Long posId, Long addressId, Long phoneNumberId, Long salariesId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.deptId = deptId;
        this.posId = posId;
        this.addressId = addressId;
        this.phoneNumberId = phoneNumberId;
        this.assignedProjects = new ArrayList<>();
        this.createdProjects = new ArrayList<>();
        this.salariesId = salariesId;
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

    public Long getDeptId() {
        return deptId;
    }

    public void setDeptId(Long deptId) {
        this.deptId = deptId;
    }

    public Long getPosId() {
        return posId;
    }

    public void setPosId(Long posId) {
        this.posId = posId;
    }

    public Collection<Project> getAssignedProjects() {
        return assignedProjects;
    }

    public void setAssignedProjects(Collection<Project> assignedProjects) {
        this.assignedProjects = assignedProjects;
    }

    public Collection<Project> getCreatedProjects() {
        return createdProjects;
    }

    public void setCreatedProjects(Collection<Project> createdProjects) {
        this.createdProjects = createdProjects;
    }

    public Long getSalariesId() {
        return salariesId;
    }

    public void setSalariesId(Long salariesId) {
        this.salariesId = salariesId;
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
