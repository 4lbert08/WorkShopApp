package org.ulpgc.is1.model;

public class Item {

    private SparePart sparepart;
    private Repair repair;
    private int quantity;

    public Item(SparePart sparepart, Repair repair, int quantity) {
        this.sparepart = sparepart;
        this.repair = repair;
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
