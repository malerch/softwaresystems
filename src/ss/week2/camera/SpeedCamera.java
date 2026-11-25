package ss.week2.camera;

/**
 * Class representing a speed camera that records speeds one-by-one in a dynamic array.
 */
public class SpeedCamera {
    public static final int INITIAL_CAPACITY = 4;
    private int limit;
    private int[] measurements;
    private int count;

    /**
     * Creates a speed camera with limit 80 km/h.
     */
    public SpeedCamera() {
        this(80);
    }

    /**
     * Creates a speed camera with specified limit.
     * @param limit speed limit in km/h
     */
    public SpeedCamera(int limit) {
        this.limit = limit;
        this.measurements = new int[INITIAL_CAPACITY];
        this.count = 0;
    }

    /**
     * Returns the average speed of the previous k measurements.
     * @param k the number of measurements to average, >= 0
     * @return the average of the last k measurements in km/h; 0 if k is 0 or no measurements
     */
    public double averageLast(int k) {
        return 0.0;
    }

    /**
     * Returns the number of speeding vehicles counted.
     * @return number of speeding vehicles
     */
    public int countSpeeding() {
        return 0;
    }

    /**
     * Returns the highest measured speed.
     * @return the highest speed or 0 if no measurements
     */
    public int fastest() {
        return 0;
    }

    /**
     * Returns the total number of measurements.
     * @return total number of measurements
     */
    public int getCount() {
        return this.count;
    }

    /**
     * Returns the speed limit.
     * @return the speed limit in km/h
     */
    public int getLimit() {
        return this.limit;
    }

    /**
     * Returns the measurement at an index.
     * @param index the index to check, from 0 to getCount() - 1
     * @return the speed at index in km/h
     */
    public int getSpeed(int index) {
        return this.measurements[index];
    }

    /**
     * Record a new given measurement for a passing vehicle.
     * @param speed the measured speed
     */
    public void record(int speed) {
        this.measurements[count] = speed;
        count++;
    }

    /**
     * Remove the oldest measurement. Remaining measurements shift one place forward.
     * Assumes there is at least one measurement.
     */
    public void removeOldest() {
    }

    /**
     * Returns the total of the fines for all measurements.
     * @return total fines in euro
     */
    public int totalFines() {
        return 0;
    }
}