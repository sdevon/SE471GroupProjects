package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
       // show company name
        Company company = new Company();

        company.setName("ABCCO");

        System.out.println("Company name is: " + company.getName());


        //show list of employees

        Worker w1 = new Worker("Jack", 123456789);
        Worker w2 = new Worker("Katie", 234567891);
        Worker w3 = new Worker("Amy", 345678912);
        Worker w4 = new Worker("Jim", 645678912);
        Worker w5 = new Worker("Greg", 745678912);



        ArrayList<Worker> list = new ArrayList<>();
        list.add(w1);
        list.add(w2);
        list.add(w3);
        list.add(w4);
        list.add(w5);

        for(Worker w : list) {
            System.out.println(w);
        }

        Manager m1 = new Manager("John", 111111111);
        Manager m2 = new Manager("Mary", 222222222);


        System.out.println("Managers are: " + m1.getName() + " , "+ m2.getName());

        Owner owner = new Owner("Craig", 80000000);
        System.out.println("Owners Name: " + owner.getName());
        owner.announceNews("Good Job");




    }
}
