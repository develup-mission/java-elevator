package elevator;

import java.util.Scanner;

public class InputView {

    private static final Scanner SCANNER = new Scanner(System.in);

    private InputView() {}

    public static int inputMoveFloor(int currentFloor) {
        System.out.printf("엘리베이터가 현재 %d층에 있습니다.", currentFloor);
        System.out.print("이동할 층을 입력하세요: ");
        String input = SCANNER.next();
        System.out.println();
        return InputValidator.parseInt(input);
    }
}
