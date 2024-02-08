package bird_version1;

public class Parrot extends BirdV1{

    public Parrot(int weight, String color) {
        super(weight, color);
    }

    @Override
    void fly() {
        System.out.println("Parrot fly!");
    }
}
