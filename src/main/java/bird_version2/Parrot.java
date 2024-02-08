package bird_version2;

public class Parrot implements Bird, Flyable{
    @Override
    public void eat() {
        System.out.println("Eagle mostly eats rice!");
    }

    @Override
    public void fly() {
        System.out.println("Parrot's fly normal height!");
    }
}
