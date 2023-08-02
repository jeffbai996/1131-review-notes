
/**
 * Write a description of class Enums here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Enums
{
    // Create enumerated type Flavor
    // enums are defined outside of the main class
    enum Flavor {vanilla, chocolate, strawberry, coffee, cookiesAndCream, rockyRoad}
    
    public static void main(String[] args) {
        Flavor cone1, cone2, cone3;
        
        cone1 = Flavor.rockyRoad;
        cone2 = Flavor.coffee;
        
        // enums have an ordinal value, i.e. what their position is in the enum
        System.out.println("cone1 value: " + cone1);
        System.out.println("cone1 ordinal: " + cone1.ordinal());
        System.out.println("cone1 name: " + cone1.name());
    }
}
