package homework_4_1;

public class RobotCoocker extends Robot{
    RobotCoocker(){
        this.name="RobotCoocker";
    }
    @Override
    public void work(){
        System.out.println("Я "+name+" - я просто готую.");
    }
}
