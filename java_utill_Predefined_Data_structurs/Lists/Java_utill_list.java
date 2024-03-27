package java_utill_Predefined_Data_structurs.Lists; // Pakage name Don't get scared

import java.util.ArrayList; // Importing libraries 
import java.util.List;

public class Java_utill_list {
    public static void main(String[] args) {
        // Creating a list of strings
        List stringList = new ArrayList(); // Creating instances of ArrayList() class 
                                           // generics can be used to lock the list's data type which would make it an array
                                           // List<String> stringList = new ArrayList<>(); creating instance with generics 
                                           // Though using generics woun't let us add datats of unspecified types
        stringList.add("Hello");
        stringList.add("World");
        stringList.add(141);
        stringList.add(141.5);

        // Iterating through the list
        for ( var i : stringList) { // If using generics speficly the Type of iterating varriable 'i' 
            System.out.println(i);
        }

        // Above for loop is java's way of saying " for i in stringList : ""

    }
}

