package src.CoffeeMaker.Coffee;

import CoffeeMaker.CMM_IF;

public interface CoffeeIF {
    public void start();
    public void setEnv(CMM_IF t_env);
    public double getPrice();
    public void setPrice(double num);
}
