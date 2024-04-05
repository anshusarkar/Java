package java_utill_Predefined_Data_structurs.Set; // Pakage name Don't get scared


import java.util.HashSet;
import java.util.Set;

public class Java_utill_Set {
    public static void main(String[] args) {
        // Creating a Set of integers
        
        Set<Integer> numberSet = new HashSet<>(); // <> part is called generics 
                                                  // Thoufgh I don't usderstand why Set class and HashSet class is imported and 
                                                  // their instance numberset is using both HashSet and Set references ?

        // Adding elements to the Set
        numberSet.add(5);
        numberSet.add(10);
        numberSet.add(15);

        // Adding duplicate elements (ignored in a Set)
        numberSet.add(10);

        // Displaying the elements of the Set
        System.out.println("Number Set:");
        for (Integer num : numberSet) {
            System.out.println(num);
        }
    }
}
