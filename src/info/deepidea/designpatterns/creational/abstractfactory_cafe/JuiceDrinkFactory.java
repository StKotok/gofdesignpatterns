package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class JuiceDrinkFactory implements DrinkFactory {

    public Filler getFiller() {
        return new Ice();
    }

    public Liquid getLiquid() {
        return new JuiceLiquid();
    }

    public Pack getPack() {
        return new Glass();
    }

}
