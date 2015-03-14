package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class Glass implements Pack {
    private Filler filler;
    private Liquid liquid;

    public Glass() {
        System.out.println("glass given");
    }

    @Override
    public String toString() {
        return "glass";
    }

    @Override
    public void fill(Filler filler) {
        this.filler = filler;
        System.out.println("Glass is filled with " + filler.toString());
    }

    @Override
    public void pour(Liquid liquid) {
        this.liquid = liquid;
        System.out.println("Glass is poured with " + liquid.toString());
    }
}
