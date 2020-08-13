package src.CoffeeMaker.Coffee;

import CoffeeMaker.CMM_IF;
import CoffeeMaker.Condiment.Chocolate;

public class CoffeeLatte implements CoffeeIF {
    private CMM_IF env;
    private double price = 3.00;

    @Override
    public void start() {
        env.setPowerLED(1);
        env.setTypeLED(3);
        env.setGrindingTime(10);
        env.setTemperature(800);
        env.holdTemperature(80);
        env.addCondiment(new Chocolate());
        env.addCondiment(new Chocolate());
        env.wait(600);
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
