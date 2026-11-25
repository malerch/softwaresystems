package ss.week2;

import java.util.Scanner;

/**
 * This class is a textual user interface for the ThreeWayLamp class.
 */
public class ThreeWayLampTUI {
    private final ThreeWayLamp lamp;

    public static void main(String[] args) {
        ThreeWayLampTUI tui = new ThreeWayLampTUI();
        tui.run();
    }

    // Constructor creates the lamp, for the sake of encapsulation
    public ThreeWayLampTUI() {
        this.lamp = new ThreeWayLamp();
    }

    public void run() {
        Scanner input = new Scanner(System.in);

        while (true) {
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
                    System.out.println("\nWelcome to the ThreeWayLamp TUI. "
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
                    break;
                case "EXIT":
                    System.out.println("Closing the ThreeWayLamp TUI...");
                    return;
                default:
                    System.out.println("Unknown command");
            }
        }
    }
}
