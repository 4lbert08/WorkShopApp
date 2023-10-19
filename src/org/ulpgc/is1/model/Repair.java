package org.ulpgc.is1.model;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Repair {

    private static int NEXT_ID = 0;
    private final int id;
    private Date date;
    private String description;
    private int effort;
    private Payment payment;


    public Repair(int id, Date date, String description, int effort) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.payment = null;
    }

    public Repair(int id, Date date, String description, int effort, Payment payment) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.payment = payment;
    }

    public int getId() {
        return id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getEffort() {
        return effort;
    }

    public void setEffort(int effort) {
        this.effort = effort;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPaymentList(Payment payment) {
        this.payment = payment;
    }

    public int price() {
        if (payment == null) {
            return 0;
        }
        return payment.getAmount();
    }
}
