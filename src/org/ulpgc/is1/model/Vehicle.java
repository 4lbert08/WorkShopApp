package org.ulpgc.is1.model;

public class Vehicle {

    private String make;
    private String model;
    private Plate plate;
    private Customer owner;
    private List<Repair> repairList;

    public Vehicle(String make, String model, Plate plate, Customer owner) {
        this.make = make;
        this.model = model;
        this.plate = plate;
        this.owner = owner;
        this.repairList = new ArrayList<>();
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Plate getPlate() {
        return plate;
    }

    public void setPlate(Plate plate) {
        this.plate = plate;
    }

    public Customer getOwner() {
        return owner;
    }

    public void setOwner(Customer owner) {
        this.owner = owner;
    }

    public List<Repair> getRepairList() {
        return repairList;
    }

    public void setRepairList(List<Repair> repairList) {
        this.repairList = repairList;
    }
    public void addRepair(Repair repair){
        if(!repairList.contains(repair)) return;
        repairList.add(repair);
    }
    @Override
    public String toString(){
        return  "Make: " + this.getMake() + ", model: " + this.getModel() + ", owner: " + this.getOwner().getName() + ", plate: " + this.getPlate();
    }
    @Override
    public boolean equals(Object o){
        if (!(o instanceof Vehicle)) return false;
        Vehicle other = (Vehicle) o;
        return other.plate.equals(this.plate);
    }
}
