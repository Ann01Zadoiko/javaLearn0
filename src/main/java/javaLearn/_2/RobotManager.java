package javaLearn._2;

public class RobotManager {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.forward(20);
        robot.printCoordinates();

        robot.setCourse(90);
        robot.forward(20);
        robot.printCoordinates();

        robot.setCourse(45);
        robot.forward(20);
        robot.printCoordinates();

        RobotManager robotManager = new RobotManager();
        robot.setCourse(45);
        System.out.println(robot.getCourse());

        robotManager.changeCourse(robot);
        System.out.println(robot.getCourse());
    }
    public void changeCourse(Robot robot){
        robot.setCourse(180);
    }
}
