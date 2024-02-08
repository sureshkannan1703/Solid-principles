package bird_version2;

public class Swan implements Bird,Flyable, Swimmable{
    @Override
    public void eat() {
        System.out.println("Swan's mostly eat small insects.");
    }

    //Swan's can both fly and swim. hence implement both flyable and swimmable interfaces..
    @Override
    public void swim() {
        System.out.println("Swan's can swim!");
    }

    @Override
    public void fly() {
        System.out.println("Swan's can swim!");
    }
}
