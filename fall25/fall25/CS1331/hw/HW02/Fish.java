/**
 * Represents a Fish object.
 * HW02: Gone Fishing.
 * @author Saahas Swaroop
 * @version 1.0
 */
public class Fish {

    /** The name of the fish. */
    protected final String name;

    /** The length of the fish in inches. */
    protected Double length;

    /** The weight of the fish in ounces. */
    protected Double weight;

    /** Tracks the total number of fish created. */
    private static int totalFish = 0;

    /**
     * Validates the name.
     * @param n the provided name
     * @return a valid name string
     */
    private String validateName(String n) {
        if (n == null || n.trim().isEmpty()) {
            return "Nemo";
        }
        return n;
    }

    /**
     * Validates the length.
     * @param l the provided length
     * @return a valid length value
     */
    private Double validateLength(Double l) {
        if (l == null || l <= 0 || Double.isInfinite(l) || Double.isNaN(l)) {
            return 8.0;
        }
        return l;
    }

    /**
     * Validates the weight.
     * @param w the provided weight
     * @return a valid weight value
     */
    private Double validateWeight(Double w) {
        if (w == null || w <= 0 || Double.isInfinite(w) || Double.isNaN(w)) {
            return 2.0;
        }
        return w;
    }

    /**
     * Constructs a Fish with the given parameters.
     * @param name the fish's name
     * @param length the fish's length in inches
     * @param weight the fish's weight in ounces
     */
    public Fish(String name, Double length, Double weight) {
        this.name = validateName(name);
        this.length = validateLength(length);
        this.weight = validateWeight(weight);
        totalFish++;
    }

    /** Default constructor for a generic fish. */
    public Fish() {
        this("Nemo", 5.0, 2.0);
    }

    /**
     * Copy constructor.
     * @param fish the Fish to copy
     */
    public Fish(Fish fish) {
        this(fish.name, fish.length, fish.weight);
    }

    /**
     * Formats the length as feet and inches.
     * @return formatted string
     */
    public String formatLength() {
        int feet = (int) Math.floor(length / 12.0);
        double inches = length - 12.0 * feet;
        return String.format("%d ft %.2f in", feet, inches);
    }

    /**
     * Formats the weight as pounds and ounces.
     * @return formatted string
     */
    public String formatWeight() {
        int pounds = (int) Math.floor(weight / 16.0);
        double ounces = weight - 16.0 * pounds;
        String unit = (pounds == 1) ? "lb" : "lbs";
        return String.format("%d %s %.2f oz", pounds, unit, ounces);
    }

    /**
     * Returns a string representation of this Fish.
     * @return description of the fish
     */
    @Override
    public String toString() {
        return "I'm a talking fish named " + name + ". My length is "
                + formatLength() + " and my weight is " + formatWeight() + ".";
    }
}
