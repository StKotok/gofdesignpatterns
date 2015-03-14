package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class TeaDrinkFactory implements DrinkFactory {

    public Filler getFiller() {
        return new Sugar();
    }

    public Liquid getLiquid() {
        return new TeaLiquid();
    }

    public Pack getPack() {
        return new Cup();
    }

}
