package bird_version1;

public class Penguin extends BirdV1{
    public Penguin(int weight, String color) {
        super(weight, color);
    }

    /*
    * Here Design failed due to, Liskow,Submission rule.
    * Interface forces Penguin class to fly.
    * But in reality Penguin's doesn't fly.
    * */
    @Override
    void fly() {
        return;
    }
}
