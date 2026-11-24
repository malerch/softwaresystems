package ss.week2;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ss.week2.ThreeWayLamp;

/**
 * Test program for Three way lamp..
 * Lab Exercise Software Systems.
 */
public class ThreeWayLampTest {
    /** Test variable for a <tt>ThreeWayLamp</tt> object. */
    private ThreeWayLamp lamp;

    /**
     * Sets the instance variable <tt>lamp</tt> to a well-defined initial value.
     */
    @BeforeEach
    public void setUp() {
        lamp = new ThreeWayLamp();
    }

    @Test
    public void testNewLampOff() {
        assertEquals(ThreeWayLamp.LampSetting.OFF, lamp.getSetting());
    }

    @Test
    public void testSwitchSequence() {
        lamp.switchSetting();
        assertEquals(ThreeWayLamp.LampSetting.LOW, lamp.getSetting());
        lamp.switchSetting();
        assertEquals(ThreeWayLamp.LampSetting.MEDIUM, lamp.getSetting());
        lamp.switchSetting();
        assertEquals(ThreeWayLamp.LampSetting.HIGH, lamp.getSetting());
        lamp.switchSetting();
        assertEquals(ThreeWayLamp.LampSetting.OFF, lamp.getSetting());
    }

    @Test
    public void testChangeSetting() {
        for (ThreeWayLamp.LampSetting setting : ThreeWayLamp.LampSetting.values()) {
            lamp = new ThreeWayLamp();
            lamp.changeSetting(setting);
            assertEquals(setting, lamp.getSetting());
        }
    }
}
