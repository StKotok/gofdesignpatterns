package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class TeaLiquid implements Liquid {

    public TeaLiquid() {
        System.out.println("tea liquid added");
    }

    @Override
    public String toString() {
        return "tea";
    }

}
