package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class JuiceLiquid implements Liquid {

    public JuiceLiquid() {
        System.out.println("juice liquid added");
    }

    @Override
    public String toString() {
        return "juice";
    }

}
