import java.util.*;

public class PersonInfo {
    public static void main(String[] args) {
        if (args.length < 3) {
          System.out.println("Invalid arguments. Please provide name, age, and city as command-line arguments.");
          return; // exit the program
        }
        //argument 0,1,2 take values String like Melie byte like 25 and city string Boston
        String name = args[0];
        //The Byte.valueOf(args[1]) in a try-catch block is to
        // parse the input string as a byte value and assign it to the age variable if it is a valid byte value.
        byte age = 0;
        try {
          age = Byte.valueOf(args[1]);
        } catch (NumberFormatException e) {
          System.out.println("Invalid age. Please enter a valid byte value between -128 and 127.");
          return; // exit the program
        }
        String city = args[2];
        
	      //prints out the name of the person
        System.out.println("Name: " + name);

        /**
      * converts the byte value of age to a String. A valid byte value between -128 and 127.
      */
        System.out.println("Age: " + Byte.toString(age));

        //prints out the city of the person
        System.out.println("City: " + city);
    }
}
