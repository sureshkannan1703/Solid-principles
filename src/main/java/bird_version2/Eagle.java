package bird_version2;

public class Eagle implements Bird , Flyable{
    @Override
    public void eat() {
        System.out.println("Eagle mostly eats fishes!");
    }

    @Override
    public void fly() {
        System.out.println("Eagle Fly very high!");
    }
}
