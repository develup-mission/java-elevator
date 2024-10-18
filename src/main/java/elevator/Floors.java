package elevator;

import java.util.ArrayList;
import java.util.List;

public class Floors {

    private final List<Floor> floors;

    public Floors(int N) {
        this.floors = new ArrayList<>();
        for (int i = 1; i <= N; i++) {
            floors.add(new Floor(i));
        }
    }

    public List<Floor> move(int currentFloor, int moveFloor) {
        List<Floor> moveFloors = new ArrayList<>();
        for (int i = currentFloor; i < moveFloor; i++) {
            moveFloors.add(floors.get(i));
        }
        return moveFloors;
    }
}
