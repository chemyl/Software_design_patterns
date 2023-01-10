package quakType;

public class MediumQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("It's a medium sound here");
    }
}
