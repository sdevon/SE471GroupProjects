package src.CoffeeMaker;

import CoffeeMaker.Coffee.CoffeeIF;
import CoffeeMaker.Condiment.Chocolate;
import CoffeeMaker.Condiment.Cream;
import CoffeeMaker.Condiment.CondimentsIF;
import CoffeeMaker.Condiment.Vanilla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CoffeeMachine implements CMM_IF {
    // LED display with two digits.
    // The first digit is either 0 running or 1 not running.
    // The second digit is from 1 to 5, indicating the currently chosen program.
    private int first_LED;
    private int second_LED;

    // The CMM stores their sale records into a data structure List<CoffeeIF>.
    private CoffeeIF currentCoffee;
    private List<CondimentsIF> condimentsIFList;
    private List<CoffeeIF> transactions;
    private static CoffeeMachine machine = null;


    private CoffeeMachine(){
        first_LED = 0;
        second_LED = 0;
        condimentsIFList = new ArrayList<>();
        transactions = new ArrayList<>();
        currentCoffee = null;
    }

    public static CoffeeMachine getInstance(){
        if(machine == null)
            machine = new CoffeeMachine();
        return machine;
    }

    public void startCoffee() throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        while(true) {
            String str = displayMenu();
            if (str == "Stop") {
                break;
            }
            else{
                this.setCoffeeType(str);
                this.currentCoffee.start();
                this.computePrice();
            }
        }
        // get "user input"
        // make the damn coffee by using the COFFEE IF
    }
    // CMM has a MENU with a list of the 5 coffee-types
    private String displayMenu() {
        Scanner scan = new Scanner(System.in);  // Create a Scanner object
        System.out.println("****************** CMM Coffer Maker ******************");
        if (first_LED == 0) { // if machine is NOT running a coffee program
            System.out.println("-> Good Morning! What TYPE of Coffee would you like to make?");
            //Display Coffee options
            System.out.println("-> Regular");
            System.out.println("-> Mocha");
            System.out.println("-> Latte");
            System.out.println("-> Espresso");
            System.out.println("-> Cappuccino");
            System.out.println("-> Stop");
            System.out.println("-> Type your selection");
        }
        else { // if machine is running a coffee program, cannot make new coffee
            System.out.print("-> A coffee is currently in progress.");
        }
        String s = scan.nextLine();
        return s;
    }

    @Override
    public void setCoffeeType(String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException{
        ClassLoader cl = this.getClass().getClassLoader();
        Class c = null;


        switch(str){
            case "Regular" : c = cl.loadClass("CoffeeMaker.Coffee.CoffeeRegular");break;
            case "Mocha" : c = cl.loadClass("CoffeeMaker.Coffee.CoffeeMocha");break;
            case "Latte" : c = cl.loadClass("CoffeeMaker.Coffee.CoffeeLatte");break;
            case "Espresso" : c = cl.loadClass("CoffeeMaker.Coffee.CoffeeEspresso");break;
            case "Cappuccino" : c = cl.loadClass("CoffeeMaker.Coffee.CoffeeCappuccino");break;
        }

        assert c != null;
        currentCoffee = (CoffeeIF) c.newInstance();
        currentCoffee.setEnv(this);


    }

    @Override
    public void setGrindingTime(int secs) {
        System.out.println("Grinding for " + secs + " seconds");
    }

    @Override
    public void addCondiment(CondimentsIF type) {
        condimentsIFList.add(type);
        if(type.equals(new Chocolate()))
            System.out.println("Adding Chocolate");
        else if(type.equals(new Cream()))
            System.out.println("Adding Cream");
        else if(type.equals(new Vanilla()))
            System.out.println("Adding Vanilla");
    }

    @Override
    public void setTemperature(int degree) {
        System.out.println("Setting temperature to " + degree + " degrees");
    }

    @Override
    public void holdTemperature(int seconds) {
        System.out.println("Holding temp for " + seconds + " seconds");
    }

    @Override
    public void wait(int seconds) {
        System.out.println("Waiting for " + seconds + " seconds");
    }

    @Override
    public void setPowerLED(int num) {
        first_LED = num;
        if(first_LED == 1)
            System.out.println("Powering On");
        else
            System.out.println("Powering Off");
    }

    @Override
    public void setTypeLED(int num) {
        second_LED = num;
        switch (second_LED){
            case 1: System.out.println("Making Regular"); break;
            case 2: System.out.println("Making Mocha"); break;
            case 3: System.out.println("Making Latte"); break;
            case 4: System.out.println("Making Espresso"); break;
            case 5: System.out.println("Making Cappuccino"); break;
            default: System.out.println("Invalid");
        }
    }


    @Override
    public void computePrice() {
        for(int i = 0; i < condimentsIFList.size(); i++){
            currentCoffee.setPrice(currentCoffee.getPrice() + condimentsIFList.get(i).getPrice());
        }
        System.out.println("The price is " + currentCoffee.getPrice());
        done();
    }


    @Override
    public void done() {
        transactions.add(currentCoffee);
    }
}