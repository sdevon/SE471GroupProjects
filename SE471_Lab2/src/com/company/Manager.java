package com.company;

public class Manager extends People {

    int salary;

    Manager(String name, int phone){
        super(name,phone);
    }



    public void addWorkerToManager(Worker w){


    }


    public void updateSalary(int i) {
        salary += i;
    }
}
