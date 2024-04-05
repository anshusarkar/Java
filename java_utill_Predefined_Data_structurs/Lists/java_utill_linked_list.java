package java_utill_Predefined_Data_structurs.Lists;

import java.util.LinkedList;

public class java_utill_linked_list {
    public static void main(String[] args) {
        // Create a LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Add elements to the LinkedList
        linkedList.add(5);
        linkedList.add(10);
        linkedList.add(15);
        linkedList.add(20);

        // Display elements of the LinkedList
        System.out.println("Elements of the LinkedList:");
        for (Integer element : linkedList) {
            System.out.println(element);
        }

        // Remove an element from the LinkedList
        linkedList.removeFirst();

        // Display elements after removal
        System.out.println("Elements after removing the first element:");

        for (Integer element : linkedList) {
            System.out.println(element);
        }
        
    }
}

