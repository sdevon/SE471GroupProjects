package src.CoffeeMaker.Coffee;

import CoffeeMaker.CMM_IF;
import CoffeeMaker.Condiment.Chocolate;
import CoffeeMaker.Condiment.Cream;
import CoffeeMaker.Condiment.Vanilla;

public class CoffeeCappuccino implements CoffeeIF {
    private CMM_IF env;
    private double price = 5.00;

    @Override
    public void start() {
        env.setPowerLED(1);
        env.setTypeLED(5);
        env.setGrindingTime(566);
        env.setTemperature(21);
        env.holdTemperature(420);
        env.wait(777);
        env.setPowerLED(0);
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