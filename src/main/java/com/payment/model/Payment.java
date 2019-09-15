package com.payment.model;

import javax.persistence.*;

@Table(name="Payment")
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Integer id;
    @Column
    private String accountNumber;
    @Column
    private String name;
    @Column
    private String transactionDetails;
    @Column
    private Long amount;

    @Override
    public String toString() {
        return "Payment{" +
                "id=" + id +
                ", accountNumber='" + accountNumber + '\'' +
                ", name='" + name + '\'' +
                ", transactionDetails='" + transactionDetails + '\'' +
                ", amount=" + amount +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransactionDetails() {
        return transactionDetails;
    }

    public void setTransactionDetails(String transactionDetails) {
        this.transactionDetails = transactionDetails;
    }

    public Long getAmount() {
        return amount;
    }

    public void setAmount(Long amount) {
        this.amount = amount;
    }
}
