package homework_4_1;

public class RobotDancer extends Robot {

    public RobotDancer(){
        this.name="RobotDancer";
    }

    @Override
    public void work(){
        System.out.println("Я "+name+" - я просто танцюю.");
    }
}
