package javaProgramming;

/** @author RAJESH CHINNAGA
 * This is a documentational comment used for documentation purpose
 * This can be treated ad a documentational comments
 */

public class TypeConversion {

    //This is a main method which is mandatory to start compilation and execution

    public static void main(String[] args){

        double d = 100.005;

        /*
        This is a type conversion where the double is converted to float , since double uses 16 bytes and float
        uses 8 bytes we need to explicitly use the conversion
         */
        float f = (float) d;

        System.out.println(f);

    }
}
