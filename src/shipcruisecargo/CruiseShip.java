package shipcruisecargo;

/**
 *
 * @author Shanell Spann
 */
public class CruiseShip extends Ship {
    int maxPassengers;

    public CruiseShip() {
        super();
    }

    public CruiseShip(String n, String t, int maxPerons) {
        super(n, t);
        this.maxPassengers = maxPerons;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public String toString() {
        return "The " + this.getName() + " has a maximum passenger capacity of " + this.getMaxPassengers() + ".";
    }
}
