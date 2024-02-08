package bird_version1;

public abstract class BirdV1 {
    public BirdV1(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    int weight;
    String color;

    abstract void fly();
}
