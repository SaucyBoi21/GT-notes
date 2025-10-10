/**
 * Represents a Catfish object.
 * HW02: Gone Fishing.
 * @author Saahas Swaroop
 * @version 1.0
 */
public class Catfish extends Fish {

    /** The length of the longest whisker. */
    private Double whiskerLength;

    /**
     * Validates the whisker length.
     * @param l the provided whisker length
     * @return valid whisker length
     */
    private double validateWhiskerLength(double l) {
        if (l <= 0 || Double.isInfinite(l) || Double.isNaN(l)) {
            return 8.0;
        }
        return l;
    }

    /**
     * Constructs a Catfish with parameters.
     * @param name the name of the catfish
     * @param length the length of the catfish
     * @param weight the weight of the catfish
     * @param newWhiskerLength the whisker length
     */
    public Catfish(String name, Double length, Double weight, Double newWhiskerLength) {
        super(name, length, weight);
        this.whiskerLength = validateWhiskerLength(newWhiskerLength);
    }

    /** Default constructor for Catfish. */
    public Catfish() {
        this("Bubba", 52.0, 720.0, 5.0);
    }

    /**
     * Copy constructor.
     * @param catfish the Catfish to copy
     */
    public Catfish(Catfish catfish) {
        this(catfish.name, catfish.length, catfish.weight, catfish.whiskerLength);
    }

    /**
     * Checks if the catfish is shaggy.
     * @return true if whisker length > body length
     */
    public boolean isShaggy() {
        return whiskerLength > length;
    }

    /**
     * Sets the whisker length.
     * @param newLength new whisker length
     */
    public void setWhiskerLength(Double newLength) {
        this.whiskerLength = validateWhiskerLength(newLength);
    }

    /**
     * Returns a string representation.
     * @return description of the catfish
     */
    @Override
    public String toString() {
        String shaggyText = isShaggy() ? "shaggy" : "not shaggy";
        return super.toString() + " I'm a catfish whose longest whisker is "
                + whiskerLength + ", so I am " + shaggyText + ".";
    }
}
