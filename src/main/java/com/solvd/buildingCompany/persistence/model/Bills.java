package com.solvd.buildingCompany.persistence.model;

import java.util.Date;
import java.util.Objects;

public class Bills {

    private Long id;

    private Double amount;

    private Date billDate;

    private Date fromDate;

    private Date toDate;

    private Date paidDate;

    private Long projectId;

    public Bills() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }

    public Date getPaidDate() {
        return paidDate;
    }

    public void setPaidDate(Date paidDate) {
        this.paidDate = paidDate;
    }

    public Long getProjectId() {
        return projectId;
    }

    public void setProjectId(Long projectId) {
        this.projectId = projectId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bills bills = (Bills) o;
        return Objects.equals(id, bills.id)
                && Objects.equals(amount, bills.amount)
                && Objects.equals(billDate, bills.billDate)
                && Objects.equals(fromDate, bills.fromDate)
                && Objects.equals(toDate, bills.toDate)
                && Objects.equals(paidDate, bills.paidDate)
                && Objects.equals(projectId, bills.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, billDate, fromDate, toDate, paidDate, projectId);
    }
}
