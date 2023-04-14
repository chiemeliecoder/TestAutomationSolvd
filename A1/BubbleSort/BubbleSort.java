import java.util.*;

public class BubbleSort {
   
    
    public static void bubbleSort(int[] arr) {
        //the length of the array that is passed from the entry point
        int n = arr.length;
        /**
	*The outer loop initializes a variable i to zero, and checks if i is less than n-1, where n 	
	*is the length of the array. If i is less than n-1, it executes the code inside the loop and 	
	*then increments i by 1. It then checks the condition again, and if i is still less than n-1, 	
	*it executes the code inside the loop again, and so on, until i is no longer less than n-1.
        */

        /**
 	*The inner loop initializes a variable j to zero, and checks if j is less than n-i-1. If j is 	
	*less than n-i-1, it executes the code inside the loop and then increments j by 1. It then 	
	*checks the condition again, and if j is still less than n-i-1, it executes the code inside 	
	*the loop again, and so on, until j is no longer less than n-i-1.
	*/

	/**
	*A temporary variable temp is created to store the value of arr[j].
	*The value of arr[j] is assigned to arr[j+1], which swaps the two values.(new value created)
	*The value of temp is assigned to arr[j], effectively placing the original value of arr[j] 	
	*into the arr[j+1] position.
	*/

        //time complexity Worst O(n^2) space complexity is 0(1)
        
       /**
	*Bubble sort has a space complexity of O(1), which means that the amount of memory it requires to 
	*solve the problem is constant and does not depend on the size of the input data.
	*/

	/**
	*bubble sort, its time complexity is O(n^2), which means that the number of operations the algorithm has to 	
	*perform grows quadratically with the size of the input data.
	*/


        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

     public static void main(String[] args) {
        int[] arr = {50, 10, 47, 1, 18, 32};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
