package elevator;

import java.util.List;

public class Elevator {

    private static final int DEFAULT_FLOOR_COUNT = 17;

    private final Floors floors;

    private int currentFloor = 1;

    public Elevator(int N) {
        floors = new Floors(N);
    }

    public Elevator() {
        this(DEFAULT_FLOOR_COUNT);
    }

    public List<Floor> move(int moveFloor) {
        List<Floor> moveFloors = floors.move(currentFloor, moveFloor);
        currentFloor = moveFloor;
        return moveFloors;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }
}
