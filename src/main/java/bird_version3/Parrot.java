package bird_version3;

import bird_version2.Bird;

public class Parrot implements Bird, Flyable {

    private FlyingBehaviour flyingBehaviour;

    public Parrot() {  //Dependency Injection. Only pass object via dependency injection.
        this.flyingBehaviour = new NormalBirdFly();   //If we want any changes in fly, changes needed here only.
    }

    /*
       Here,NormalBirdFly class directly coupled with Parrot class.
         Broke's Dependency Inversion Principle.
         Make communication through high level abstract things(Interface or abstract classes)
       @Override
       public void fly() {
           NormalBirdFly normalfly = new NormalBirdFly();
           normalfly.normalBirdFly();
       }
    */
    @Override
    public void fly() {
        flyingBehaviour.normalLevelFly();
    }

    @Override
    public void eat() {
        System.out.println("Eagle mostly eats rice!");
    }

}