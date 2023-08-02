
/**
 * Write a description of class Objects here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Objects
{
    public static void main(String[] args) {
        // Strings are objects, which are represented in the code with
        // 'references'. When you assign one object to another, you are
        // simply setting the references to be equal, i.e. the two 
        // references now point to the same object in memory
        
        String name1 = "Bob";
        String name2 = "Jack";
        
        name2 = name1;
        
        System.out.println(name2); // => "Bob", however, this did not create
        // a new object!! name2 simply points to the same object as name1.
        
        
    }
}
