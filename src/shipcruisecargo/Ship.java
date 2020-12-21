package shipcruisecargo;

/**
 *
 * @author Shanell Spann
 */
public class Ship {
    
    private String name;
    private String year;

    public Ship(){
        this.name = "";
        this.year = "";
    }

    public Ship(String n, String y) {
        this.name = n;
        this.year = y;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        return "The " + this.getName() + " was built in the year " + this.getYear() + ".";
    }
}
