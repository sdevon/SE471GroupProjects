package src.CoffeeMaker.Coffee;
import CoffeeMaker.CMM_IF;

public class CoffeeRegular implements CoffeeIF {
    private CMM_IF env;
    private double price = 1.00;

    @Override
    public void start() {
        env.setPowerLED(1);
        env.setTypeLED(1);
        env.setGrindingTime(8);
        env.setTemperature(150);
        env.holdTemperature(2);
        env.wait(15);
        env.setPowerLED(0);

        /*
        1.	Indicate the machine as running and display the purchased type of coffee to LED.
        2.	Grind coffee beans for 8 seconds.
        3.	Heat up the water to 150 degree F and hold the temperature for 2 seconds.
        4.	After 15 seconds, set the LED to indicate the machine is not running.
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