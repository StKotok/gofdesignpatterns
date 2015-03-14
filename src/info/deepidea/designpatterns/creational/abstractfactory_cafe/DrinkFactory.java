package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public interface DrinkFactory {

    Pack getPack();

    Filler getFiller();

    Liquid getLiquid();

}
