
/**
 * Write a description of class Variables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Variables
{
    public static void main(String[] args) {
        int keys = 88;
        System.out.println("A piano has " + keys + " keys");
        
        // Variables can be declared without initializing value
        // Typically program will not compile if these not given a value
        int count;
        
        // Variables can be initialized on declaration
        int x = 10;
        
        // Multiple variables may be declared on one line
        int a, b = 0, result;
        // NB: Variables may not be declared without a type!
        
        // Java is strongly-typed: 
        // A program will not compile if you attempt to assign
        // a value to a variable that is inconsistent with its
        // data type.
        
        // Constants are declared with 'final'
        final int MAX_OCCUPANCY = 427;
        // By convention, constants in Java use 'screaming snake
        // case', like MAX_OCCUPANCY
        
        // Program will not compile if you try to change the
        // value of a constant
    }
}
