package src.CoffeeMaker.Coffee;

import CoffeeMaker.CMM_IF;
import CoffeeMaker.Condiment.Cream;
import CoffeeMaker.Condiment.Vanilla;

public class CoffeeMocha implements CoffeeIF {
    private CMM_IF env;
    private double price = 2.00;

    @Override
    public void start() {
        env.setPowerLED(1);
        env.setTypeLED(2);
        env.setGrindingTime(5);
        env.setTemperature(200);
        env.holdTemperature(5);
        env.addCondiment(new Cream());
        env.addCondiment(new Vanilla());
        env.wait(15);
        env.setPowerLED(0);
        /*
        1.	Indicate the machine as running and display the purchased type of coffee to LED.
    2.	Grind coffee beans for 5 seconds.
    3.	Heat up the water to 200 degree F and hold the temperature for 5 seconds.
    4.	Add cream and vanilla once.
    5.	After 15 seconds, set the LED to indicate the machine is not running.
         */
    }

    @Override
    public void setEnv(CMM_IF t_env){
        env = t_env;
    }

    @Override
    public double getPrice(){return price;}

    @Override
    public void setPrice(double num){
        price = num;
    }
}
