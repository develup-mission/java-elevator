package elevator;

public enum Command {

    YES("y"),
    NO("n"),
    ;

    private final String command;

    Command(String command) {
        this.command = command;
    }


}
