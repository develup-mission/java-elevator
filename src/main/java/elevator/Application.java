package elevator;

public class Application {
    public static void main(String[] args) {
        ElevatorController elevatorController = ElevatorController.createElevateController();
        elevatorController.run();
    }
}
