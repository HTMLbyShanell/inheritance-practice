package shipcruisecargo;

/**
 *
 * @author Shanell Spann
 */
public class CargoShip extends Ship {
    private int tonnage;

    public int getTonnage() {
        return tonnage;
    }

    public void setTonnage(int tonnage) {
        this.tonnage = tonnage;
    }

    public CargoShip() {
        super();
    }

    public CargoShip(String n, String y, int tonage) {
        super(n, y);
        this.tonnage = tonage;
    }

    public String toString() {
        return "The " + this.getName() + " has a tonnage cargo capacity of " + this.getTonnage() + ".";
    }

}
