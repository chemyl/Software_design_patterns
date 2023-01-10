import flyingType.RocketLaunchingFly;
import quakType.LoudQuack;

public class MallardDuck extends BaseDuck {

    public MallardDuck(){
        //MallardDuck наследует переменные поведения quackBehavior и flyBehavior от базового класса BaseDuck
        //в качестве реализации поведения используются типы (LoudQuack and RocketLaunchingFly)
        quackBehavior = new LoudQuack();
        flyBehavior = new RocketLaunchingFly();
    }

    @Override
    public void display() {
        System.out.println("Look I'm a real MallardDuck extends BaseDuck");

    }
}
