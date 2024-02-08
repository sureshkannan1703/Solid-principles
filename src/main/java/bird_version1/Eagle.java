package bird_version1;

public class Eagle extends BirdV1{
    public Eagle(int weight, String color) {
        super(weight, color);
    }
    @Override
    void fly() {
        System.out.println("Eagle fly!");
    }
}
