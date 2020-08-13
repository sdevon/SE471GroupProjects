package com.company;

public class People {

    String name;
    private int phone;

    People(String name, int phone){
        this.name = name;
        this.phone = phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPhone(int phone){
        this.phone = phone;
    }

    public int getPhone() {
        return phone;
    }




}
