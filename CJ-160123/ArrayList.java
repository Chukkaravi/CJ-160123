// Java  program to iterate over an ArrayList
// Using for loop
 
// Importing all utility classes
import java.util.*;
 
// Main class
class ArrayList {
   
    // Main driver method 
    public static void main(String[] args)
    {
        // Creating and initializing the ArrayList
        // Declaring object of integer type
        List<Integer> numbers = Arrays.asList(1, 2, 3,
                                       4, 5, 6, 7, 8);
 
        // Iterating using for loop
        for (int i = 0; i < numbers.size(); i++)
           
            // Printing and display the elements in ArrayList
            System.out.print(numbers.get(i) + " ");       
    }
}

//  // Creating and initializing the ArrayList
//         // Declaring object of integer type
//         ArrayList<Integer> al = new ArrayList<Integer>();
 
//         // Adding elements to ArrayList
//         // using add() method
//         al.add(3);
//         al.add(1);
//         al.add(7);
//         al.add(20);
//         al.add(5);
 
//         // Step 1: Setting and initializing a variable
//         // as per syntax of while loop
//         // Initially declaring and setting
//         int val = 0;
 
//         // Step 2: Condition
//         // Till our counter variable is lesser than size of
//         // ArrayList
//         while (al.size() > val) {
 
//             // Printing the element which holds above
//             // condition true
//             System.out.println(al.get(val));
 
//             // Step 3: Terminating condition by incrementing
//             // our counter in each iteration
//             val++ ;
//         }


// // Declaring and initializing ArrayList
//         List<Integer> numbers
//             = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
 
//         // For Each Loop for iterating ArrayList
//         for (Integer i : numbers)
 
//             // Printing the elements of ArrayList
//             System.out.print(i + " ");