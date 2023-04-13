import java.util.*;

public class PersonInfo {
    public static void main(String[] args) {
        //argument 0,1,2 take values String like Melie byte like 25 and city string Boston
        String name = args[0];
        byte age = Byte.parseByte(args[1]);
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
