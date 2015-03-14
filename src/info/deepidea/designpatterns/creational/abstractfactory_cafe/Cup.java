package info.deepidea.designpatterns.creational.abstractfactory_cafe;

public class Cup implements Pack {
    private Filler filler;
    private Liquid liquid;

    public Cup() {
        System.out.println("cup given");
    }

    @Override
    public String toString() {
        return "cup";
    }

    @Override
    public void fill(Filler filler) {
        this.filler = filler;
        System.out.println("Cup is filled with " + filler.toString());
    }

    @Override
    public void pour(Liquid liquid) {
        this.liquid = liquid;
        System.out.println("Cup is poured with " + liquid.toString());
    }
}
