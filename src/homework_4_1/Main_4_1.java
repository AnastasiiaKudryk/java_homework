package homework_4_1;

public class Main_4_1 {
    public static void main(String[] args) {
        Robot robot=new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer=new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();

        robot.work();
        System.out.println("");

        Robot [] robots = new Robot[3];
        robots[0]=coffeRobot;
        robots[1]=robotDancer;
        robots[2]=robotCoocker;
        for (int i=0; i<3; i++){
            robots[i].work();
        };
    }
}
