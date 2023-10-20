package org.ulpgc.is1.model;

public class Mechanic {

    private String name;
    private String surname;


    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Repair> getRepairList() {
        return repairList;
    }

    public void setRepairList(List<Repair> repairList) {
        this.repairList = repairList;
    }

    public void addRepair(Repair repair) {
        if (!repairList.contains(repair)) repairList.add(repair);
    }
    @Override
    public String toString(){
        return this.getName() + this.getSurname();
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Mechanic)) return false;
        Mechanic other = (Mechanic)o;
        return ((other.name.equals(name)) && (other.surname.equals(surname)));
    }
}
