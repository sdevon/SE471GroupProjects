package src.CoffeeMaker;

import CoffeeMaker.Coffee.CoffeeIF;
import CoffeeMaker.Condiment.CondimentsIF;

public interface CMM_IF {
    // CMM COFFEE MACHINE HAS THESE FUNCTIONALITIES
    public void setCoffeeType(String str) throws ClassNotFoundException, IllegalAccessException, InstantiationException;
    public void setGrindingTime(int secs);
    public void addCondiment(CondimentsIF type);
    public void setTemperature(int degree);
    public void holdTemperature(int seconds);
    public void wait(int seconds);
    public void setPowerLED(int num);
    public void setTypeLED(int num);
    public void computePrice();
    public void done();
}