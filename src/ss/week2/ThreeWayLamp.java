package ss.week2;

import java.util.Locale;

/**
 * This class represents a lightswitch with four different settings: off, low, medium, high.
 */
public class ThreeWayLamp {
    LampSetting setting;
    enum LampSetting {
        OFF,
        LOW,
        MEDIUM,
        HIGH
    }

    public ThreeWayLamp() {

    }

    /**
     * Change the current setting to a specified setting.
     * @param newSetting specified setting to change the lamp to, as a string (naive)
     */
    public void changeSetting(String newSetting) {

    }

    /**
     * Get the current setting of the lamp.
     * @return lamp's current setting as a string
     */
    public String getSetting() {
        return "";
    }

    /**
     * Cycle to the next lamp setting (Order is off -> low -> medium -> high -> off).
     */
    public void switchSetting() {

    }
}
