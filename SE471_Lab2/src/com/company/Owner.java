package com.company;

public class Owner extends People {

   // String projName;

    Owner(String name, int number){
        super(name, number);

    }


    public void announceNews(String s){
        System.out.println("New announcement: "+ s);
    }

    private void createProject(String s){
        Project proj = new Project(s,0);
    }

    public void assignProject(){

    }

    public void startProject(){

    }

    public void UpdateSalary(Manager n){
        n.updateSalary(1000);
    }




}
