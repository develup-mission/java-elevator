package elevator;

import java.util.List;

public class OutputView {

    private OutputView() {}

    public static void printMoveFloor(List<Integer> floors) {
        int direct = floors.get(1) - floors.get(0);
        for (int i = 0; i != floors.size() - 1; i += direct) {
            System.out.printf("엘리베이터가 %d층으로 이동 중입니다..." + System.lineSeparator(), floors.get(i));
        }
        System.out.printf("엘리베이터가 %d층에 도착했습니다!" + System.lineSeparator(), floors.get(floors.size() - 1));
        System.out.println();
    }
}
