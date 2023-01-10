package quakType;

public class SilentQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("I'm make silent quack ^_^ ");
    }
}
