package quakType;

public class LoudQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I make a loud sound!");
    }
}
