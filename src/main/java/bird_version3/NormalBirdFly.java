package bird_version3;

public class NormalBirdFly implements FlyingBehaviour {
    @Override
    public void normalLevelFly() {
        System.out.println(this.getClass()+" can fly in the normal height!");
    }
}
