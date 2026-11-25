package ss.week2;

import java.util.Scanner;

/**
 * This class is a textual user interface for the ThreeWayLamp class.
 */
public class ThreeWayLampTUI {
    private final ThreeWayLamp lamp;

    /**
     * Initiates the REPL.
     * @param args Commandline arguments (unused)
     */
    public static void main(String[] args) {
        ThreeWayLampTUI tui = new ThreeWayLampTUI();
        tui.run();
    }

    // Constructor creates the lamp, for the sake of encapsulation
    public ThreeWayLampTUI() {
        this.lamp = new ThreeWayLamp();
    }

    /**
     * Print the TUI help menu to the console.
     */
    public void commandHelp() {
        System.out.println(
                "\nWelcome to the ThreeWayLamp TUI. "
                + "\nUsage: \n"
                + "\nOFF: Set the lamp to OFF "
                + "\nLOW: Set the lamp to LOW "
                + "\nMEDIUM: Set the lamp to MEDIUM "
                + "\nHIGH: Set the lamp to HIGH "
                + "\nSTATE: Print the current setting of the lamp "
                + "\nNEXT: Change to the next setting, observing the order OFF → LOW → MEDIUM → HIGH → OFF"
                + "\nHELP: Displays a help message"
                + "\nEXIT: Exit the ThreeWayLamp TUI"
        );
    }

    /**
     * Main REPL for the TUI; ask the user for an input, execute the respective command, repeat.
     */
    public void run() {
        Scanner input = new Scanner(System.in);
        boolean exit = false;
        this.commandHelp();

        while (!exit) {
            System.out.print("ThreeWayLampTUI >");
            String next_command = input.nextLine();
            switch (next_command) {
                case "OFF", "LOW", "MEDIUM", "HIGH":
                    lamp.changeSetting(ThreeWayLamp.LampSetting.valueOf(next_command));
                    break;
                case "STATE":
                    System.out.printf("Current state: %s\n", lamp.getSetting().name());
                    break;
                case "NEXT":
                    lamp.switchSetting();
                    break;
                case "HELP":
                    this.commandHelp();
                    break;
                case "EXIT":
                    System.out.println("Closing the ThreeWayLamp TUI...");
                    exit = true;
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
