package org.ulpgc.is1.model;

import org.jetbrains.annotations.NotNull;

public class Phone {

    private String number;


    public Phone(String number){
        if (isValid(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }

    public boolean isValid(@NotNull String phone) {
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) return false;
        }
        return true;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        if (isValid(number)) {
            this.number = number;
        } else {
            this.number = "XXXX";
        }
    }
}