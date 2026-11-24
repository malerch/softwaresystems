package ss.week2;

import java.util.Locale;

/**
 * This class represents a lightswitch with four different settings: off, low, medium, high.
 */
public class ThreeWayLamp {
    private LampSetting currentSetting;
    public enum LampSetting {
        OFF,
        LOW,
        MEDIUM,
        HIGH
    }

    public ThreeWayLamp() {
        this.currentSetting = LampSetting.OFF;
    }

    /**
     * Change the current setting to a specified setting.
     * @param newSetting specified setting to change the lamp to, as a ThreeWayLamp.LampSetting
     */
    public void changeSetting(ThreeWayLamp.LampSetting newSetting) {
        this.currentSetting = newSetting;
    }

    /**
     * Get the current setting of the lamp.
     * @return lamp's current setting as a ThreeWayLamp.LampSetting
     */
    public ThreeWayLamp.LampSetting getSetting() {
        return this.currentSetting;
    }

    /**
     * Cycle to the next lamp setting (Order is off -> low -> medium -> high -> off).
     */
    public void switchSetting() {
        switch (this.currentSetting) {
            case OFF:
                this.currentSetting = LampSetting.LOW;
                break;
            case LOW:
                this.currentSetting = LampSetting.MEDIUM;
                break;
            case MEDIUM:
                this.currentSetting = LampSetting.HIGH;
                break;
            default:
                this.currentSetting = LampSetting.OFF;
        }
    }
}
