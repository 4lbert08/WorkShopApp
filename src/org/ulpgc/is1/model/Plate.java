package org.ulpgc.is1.model;

import org.jetbrains.annotations.NotNull;

public class Plate {

    private String number;


    public Plate (String plate){
        if(this.isValid(plate)){
            this.number = plate;
        } else {
            this.number = "XXXX";
        }
    }

    public boolean isValid(@NotNull String plate) {
        for (int i = 0; i < plate.length(); i++) {
            if (!Character.isDigit(plate.charAt(i))) return false;
        }
        return true;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if(this.isValid(number)){
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }
}
