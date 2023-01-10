import flyingType.MediumSpeedFly;
import quakType.MediumQuack;

public class ModelDuck extends BaseDuck{

    public ModelDuck(){
        /*/
        //Каждая модель содержит экземпляры Поведения и им делегируется выполнение сответствующих операций


         */
        flyBehavior = new MediumSpeedFly();
        quackBehavior = new MediumQuack();
    }

    @Override
    public void display() {
        System.out.println("Hello! I'm ModelDuck with stylish botoxed lips ;* ");
    }
}

