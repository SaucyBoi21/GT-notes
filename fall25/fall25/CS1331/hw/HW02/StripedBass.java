/**
 * Represents a StripedBass object.
 * HW02: Gone Fishing.
 * @author Saahas Swaroop
 * @version 1.0
 */
public class StripedBass extends Fish {

    /** Number of stripes on the bass. */
    private int stripeCount;

    /** True if the bass lives in saltwater. */
    private boolean isSaltwater;

    /** The Catfish best friend (deep copied). */
    private Catfish bestFriend;

    /**
     * Validates stripe count.
     * @param count the given stripe count
     * @return valid stripe count (defaults to 25 if invalid)
     */
    private int validateStripeCount(int count) {
        return (count > 0) ? count : 25;
    }

    /**
     * Constructs a StripedBass with parameters.
     * @param name the name
     * @param length the length
     * @param weight the weight
     * @param newStripeCount number of stripes
     * @param saltwater true if saltwater fish
     * @param friend Catfish best friend
     */
    public StripedBass(String name, Double length, Double weight,
                       int newStripeCount, boolean saltwater, Catfish friend) {
        super(name, length, weight);
        this.stripeCount = validateStripeCount(newStripeCount);
        this.isSaltwater = saltwater;
        this.bestFriend = (friend == null) ? null : new Catfish(friend);
    }

    /** Default constructor for StripedBass. */
    public StripedBass() {
        this("Striper", 30.0, 320.0, 14, false, null);
    }

    /**
     * Copy constructor.
     * @param other the StripedBass to copy
     */
    public StripedBass(StripedBass other) {
        this(other.name, other.length, other.weight,
                other.stripeCount, other.isSaltwater,
                (other.bestFriend == null) ? null : new Catfish(other.bestFriend));
    }

    /** Toggles saltwater/freshwater if no best friend. */
    public void migrate() {
        if (bestFriend == null) {
            isSaltwater = !isSaltwater;
        }
    }

    /**
     * Returns a string representation.
     * @return formatted description
     */
    @Override
    public String toString() {
        String water = isSaltwater ? "saltwater" : "freshwater";
        String friendInfo = (bestFriend == null)
                ? "no best friend"
                : "a best friend named " + bestFriend.name;
        return super.toString() + " I'm a " + water
                + " striped bass with " + stripeCount
                + " stripes. I have " + friendInfo + ".";
    }
}
