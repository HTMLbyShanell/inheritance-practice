package shipcruisecargo;

/**
 *
 * @author Shanell Spann
 */
public class ShipCruiseCargo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ship[] shipsArray = new Ship[3];
        shipsArray[0] = new Ship("Louise Ship", "1930");
        shipsArray[1] = new CruiseShip("Trudy Cruise Ship", "1930", 10000);
        shipsArray[2] = new CargoShip("Marilyn Cargo Ship", "1930", 145678);

        for(int i=0; i < shipsArray.length; i++){

            System.out.println(shipsArray[i].toString());
        }
    }  
}
