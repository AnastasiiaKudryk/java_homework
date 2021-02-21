package homework_4_1;

public class CoffeRobot extends Robot{

    public CoffeRobot(){
    this.name="CoffeRobot";
    }

    @Override
    public void work(){
        System.out.println("Я "+name+" - я варю каву.");
    }
}
