package src.CoffeeMaker.Coffee;

import CoffeeMaker.CMM_IF;
import CoffeeMaker.Condiment.Chocolate;
import CoffeeMaker.Condiment.Cream;
import CoffeeMaker.Condiment.Vanilla;

public class CoffeeEspresso implements CoffeeIF {
    private CMM_IF env;
    private double price = 4.00;

    @Override
    public void start() {
        env.setPowerLED(1);
        env.setTypeLED(4);
        env.setGrindingTime(999);
        env.setTemperature(5);
        env.holdTemperature(2);
        env.addCondiment(new Chocolate());
        env.addCondiment(new Cream());
        env.addCondiment(new Vanilla());
        env.wait(999);
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
