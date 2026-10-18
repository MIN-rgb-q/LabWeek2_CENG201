/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Name:        ___________________
 * Student ID:  ___________________
 * Date:        ___________________
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println();
        System.out.println();

        // -------------------------------------------------------
        // Test 1: Odd number of nodes
        // TODO:
        // 1. Created a singlyLİnkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node

        SingleLinkedList oddNumber = new SingleLinkedList();

        for (int i = 1; i <= 5; ++i) {
            oddNumber.add(i);
        }

        System.out.println("Original List 1:");
        oddNumber.display();

        System.out.println("After deleting middle:");
        oddNumber.deleteMiddle();
        oddNumber.display();

        System.out.println("Middle Node: " + oddNumber.findMiddle().data );
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // TODO:
        // 1. Created another singlyLİnkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Found and print the middle Node

        SingleLinkedList evenNumber = new SingleLinkedList();

        for (int i = 10; i <= 60; i += 10) {
            evenNumber.add(i);
        }

        System.out.println("Original List 2:");
        evenNumber.display();

        System.out.println("After deleting middle:");
        evenNumber.deleteMiddle();
        evenNumber.display();

        System.out.println("Middle Node: " + evenNumber.findMiddle().data );
        System.out.println();

    }
}