package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class Sugar implements Filler {

    public Sugar() {
        System.out.println("sugar taken");
    }

    @Override
    public String toString() {
        return "sugar";
    }
}
