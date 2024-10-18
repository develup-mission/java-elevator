package elevator;

import java.util.List;

public class ElevatorController {

    private final Elevator elevator;

    private ElevatorController(Elevator elevator) {
        this.elevator = elevator;
    }

    public static ElevatorController createElevateController() {
        return new ElevatorController(new Elevator());
    }

    public void run() {
        int moveFloor;
        while ((moveFloor = InputView.inputMoveFloor(elevator.getCurrentFloor())) > 0) {
            List<Floor> moveFloors = elevator.move(moveFloor);
            List<Integer> floors = moveFloors.stream().map(Floor::getFloor).toList();
            OutputView.printMoveFloor(floors);
        }
    }
}
