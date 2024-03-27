package java_utill_Predefined_Data_structurs.HasMap_or_Maps; // Pakage name Don't get scared

import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Java_utill_HashMap {
    public static void main(String[] args) {

        // HashMap's or Maprs are more like Dictionaries in Python 
        // Where Key and Value pairs are used 
        // Creating a map of <String, Integer> using <> i.e. generics 
        // Where String is the Key and Integer is the pair

        Map<String, Integer> myMap = new HashMap<>();

        // Adding key-value pairs to the map
        myMap.put("One", 1);
        myMap.put("Two", 2);
        myMap.put("Three", 3);

        // Accessing values by keys
        System.out.println("Value of 'One': " + myMap.get("One"));
        System.out.println("Value of 'Two': " + myMap.get("Two"));

        // Iterating through the map
        System.out.println("Iterating through the map:");
        for (Entry<String, Integer> entry : myMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}


