import java.util.Scanner;

public class Menu {

    private final static String START = "Н";
    private final static String QUIT = "В";
    private final static String COMMAND_REGEX = "[%s%s]".formatted(START, QUIT);

    private final Scanner input;

    public Menu(Scanner input) {
        this.input = input;
    }

//    public void readSomething(){
//        String line = scan.nextLine();
    // Do something


        public String inputCommand() {
            System.out.println("(Н)ачать игру или (В)ыйти");
            while (true) {
                String command = input.nextLine().toUpperCase();
                if (!isValidCommand(command)) {
                    System.out.printf("Введите букву %s или %s %n", START, QUIT);
                } else {
                    return command;
                }
            }
        }

        private boolean isValidCommand(String command){
            return command.length() == 1 && command.matches(COMMAND_REGEX);
        }

}


