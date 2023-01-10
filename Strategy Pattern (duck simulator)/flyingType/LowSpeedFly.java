package flyingType;

public class LowSpeedFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Low speed flying. Ground speed - 15km/h");
    }
}
