import java.util.Random;

/**
 * Represents a FlyingFish object.
 * HW02: Gone Fishing.
 * @author Saahas Swaroop
 * @version 1.0
 */
public class FlyingFish extends Fish {

    /** The maximum flight time in seconds. */
    private int flightTime;

    /**
     * Validates flight time.
     * @param time the given time
     * @return valid flight time
     */
    private int validateFlightTime(int time) {
        return (time > 0) ? time : 30;
    }

    /**
     * Constructs a FlyingFish with parameters.
     * @param name the name
     * @param length the length
     * @param weight the weight
     * @param newFlightTime flight duration in seconds
     */
    public FlyingFish(String name, Double length, Double weight, int newFlightTime) {
        super(name, length, weight);
        this.flightTime = validateFlightTime(newFlightTime);
    }

    /** Default constructor for FlyingFish. */
    public FlyingFish() {
        this("Gilbert", 12.0, 24.0, 36);
    }

    /**
     * Copy constructor.
     * @param other the FlyingFish to copy
     */
    public FlyingFish(FlyingFish other) {
        this(other.name, other.length, other.weight, other.flightTime);
    }

    /**
     * Calculates the flight power.
     * @return weight × flightTime
     */
    public double calculatePower() {
        return weight * flightTime;
    }

    /** Prints a random flight duration message. */
    public void fly() {
        Random random = new Random();
        double time = (1.0 - random.nextDouble()) * flightTime;
        System.out.printf("Woohoo! %s flew for %.2f seconds.%n", name, time);
    }

    /**
     * Returns a string representation.
     * @return description of the FlyingFish
     */
    @Override
    public String toString() {
        return super.toString()
                + " I'm a flying fish, and my flight time record is "
                + flightTime + ", so my power is "
                + String.format("%.2f", calculatePower()) + ".";
    }
}
