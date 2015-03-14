package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class Ice implements Filler {

    public Ice() {
        System.out.println("ice taken");
    }

    @Override
    public String toString() {
        return "ice";
    }

}
