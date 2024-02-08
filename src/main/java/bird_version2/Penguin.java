package bird_version2;

public class Penguin implements Bird,Swimmable{
    @Override
    public void eat() {
        System.out.println("Eagle mostly eats rice!");
    }

    //Penguin's doesn't fly, we can ignore implementing Flyable interface.
    @Override
    public void swim() {
        System.out.println("Penguin's can swim!");
    }
}
