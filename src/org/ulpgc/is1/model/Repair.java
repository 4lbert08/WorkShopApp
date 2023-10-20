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
    private List<Mechanic> mechanicList;
    private Vehicle vehicle;
    private List<BreakdownTypes> breakdownTypes;
    private List<Item> itemsList;
    private Payment payment;


    public Repair(int id, Date date, String description, int effort, List<BreakdownTypes> breakdownTypes) {
        this.id = id;
        this.date = date;
        this.description = description;
        this.effort = effort;
        this.breakdownTypes = new ArrayList<>(breakdownTypes);
        this.payment = null;
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

    public List<Mechanic> getMechanicList() {
        return mechanicList;
    }

    public void setMechanicList(List<Mechanic> mechanicList) {
        this.mechanicList = mechanicList;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public List<BreakdownTypes> getBreakdownTypes() {
        return breakdownTypes;
    }

    public void setBreakdownTypes(List<BreakdownTypes> breakdownTypes) {
        this.breakdownTypes = breakdownTypes;
    }

    public List<Item> getItemsList() {
        return itemsList;
    }

    public void setItemsList(List<Item> itemsList) {
        this.itemsList = itemsList;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPaymentList(Payment payment) {
        this.payment = payment;
    }

    public void addMechanic(Mechanic mechanic) {
        if(!mechanicList.contains(mechanic)) mechanicList.add(mechanic);
    }

    public void addItem(SparePart sparePart, int amount){
        Item item = new Item(sparePart, amount);
        itemsList.add(item);
    }

    public void addBreakdownTypes(BreakdownTypes breakdownTypes1){
        if(!breakdownTypes.contains(breakdownTypes1)) breakdownTypes.add(breakdownTypes1);
    }

    public void pay(Payment payment){
        this.payment = payment;
    }

    public int price() {
        int total = 0;
        for (Item item: itemsList) {
            SparePart sparePart = item.getSparepart();
            total += item.getQuantity() * sparePart.getPrice();
        }
        return payment.getAmount();
    }
}
