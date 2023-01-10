import flyingType.RocketLaunchingFly;
import quakType.LoudQuack;

public class DuckSimulator {
    public static void main(String[] args) {
//        BaseDuck mallardDuck = new MallardDuck();
//        mallardDuck.performQuack();
//        mallardDuck.performFly();

        BaseDuck modelDuck  = new ModelDuck();
        modelDuck.performFly();     //Передается реализацию запланированная в конструкторе класса ModelDuck
        modelDuck.setFlyBehavior(new RocketLaunchingFly()); //Переключение на новый тип поведения
        modelDuck.performFly();
        modelDuck.performQuack();
        modelDuck.setQuackBehavior(new LoudQuack());//Переключенеи на новый тип поведения
        modelDuck.performQuack();
    }
}
