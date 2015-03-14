package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class DrinkMachine {

    public static void main(String[] args) {
        createDrink(new TeaDrinkFactory());
        createDrink(new JuiceDrinkFactory());
    }

    public static void createDrink(DrinkFactory factory) {
        Pack pack = factory.getPack();
        Filler filler = factory.getFiller();
        pack.fill(filler);
        Liquid liquid = factory.getLiquid();
        pack.pour(liquid);
        System.out.println("The drink was created: " + pack + " + " + filler + " + " + liquid + ".\n");
    }
}
