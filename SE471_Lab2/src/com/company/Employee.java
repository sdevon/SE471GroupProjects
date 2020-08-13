package com.company;





public class Employee extends People {

private boolean isOnVacation;
private int performanceScale;
private int salary;

Employee(String name, int phone){

    super (name, phone);
}

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isOnVacation() {
        return isOnVacation;
    }


    public void setOnVacation(boolean onVacation) {
        isOnVacation = true;
    }


    public void setPerformance(int performanceScale) {
        this.performanceScale = performanceScale;
    }

    public int getPerformanceScale() {
        return performanceScale;
    }

    public void receiveNews(String n) {
        //something here;
    }

    protected void setDelegate(){
    //something here;
    }


}
