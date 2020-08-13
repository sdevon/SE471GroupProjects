package src.CoffeeMaker;

public class Main {
    public static void main (String[] args) {
        CoffeeMachine CM = CoffeeMachine.getInstance();
        {
            try {
                CM.startCoffee();
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            } catch (IllegalAccessException ex) {
                ex.printStackTrace();
            } catch (InstantiationException ex) {
                ex.printStackTrace();
            }
        }
    }
}

