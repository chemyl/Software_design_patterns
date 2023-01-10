import flyingType.FlyBehavior;
import quakType.QuackBehavior;

public abstract class BaseDuck {
    // Объявлены две ссылочные переменные с типами интерфейсов поведения
    // Переменные наследуются всеми субклассами BaseDuck
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    public BaseDuck() {
    }

    public abstract void display();

    public void performQuack() {
        //делегирование операции классам поведения
        quackBehavior.quack();
    }

    public void performFly() {
        //делегирование операции классам поведения
        flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb) {        //Методы для изменения поведения объекта в любой момент времени
        flyBehavior = fb;
    }

    public void setQuackBehavior (QuackBehavior qb){
        quackBehavior = qb;
    }
}