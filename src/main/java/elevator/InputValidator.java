package elevator;

public class InputValidator {

    private InputValidator() {}

    public static int parseInt(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("잘못된 형식의 입력입니다");
        }
    }
}
