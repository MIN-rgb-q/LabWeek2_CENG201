/**
 * SinglyLinkedList.java
 *
 * Represents a singly linked list.
 *
 * Your Name:        _________________
 * Your Student ID:  _________________
 * Your Date:        _________________
 */

public class SingleLinkedList {

    // -------------------------------------------------------
    // Instance variable

    private Node head;

    // -------------------------------------------------------
    // Constructor

    public SingleLinkedList() {
        head = null;
    }

    // -------------------------------------------------------
    // Add a node to the end of the list

    public void add(int data) {
        // TODO:
        // 1. Create a new Node.
        // 2. If the list is empty, make the new node the head.
        // 3. Otherwise, traverse to the last node.
        // 4. Link the last node to the new node.
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;

        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;

    }

    // -------------------------------------------------------
    // Display the linked list

    public void display() {
        // TODO:
        // Start from head.
        // Visit each node using next.
        // Print the data values in this format:
        //
        // 1 --> 2 --> 3 --> 4 --> 5 --> NULL
        Node currNode = head;

        while (currNode != null) {
            System.out.printf("%d -->",currNode.data);

            currNode = currNode.next;
        }
        System.out.print("NULL\n");
    }

    // -------------------------------------------------------
    // Find the middle node

    public Node findMiddle() {
        // TODO:
        //
        // Find and return the middle node.
        // For an odd number of nodes:
        //     1 --> 2 --> 3 --> 4 --> 5
        //                 ^
        //              middle
        //
        // For an even number of nodes:
        //     10 --> 20 --> 30 --> 40 --> 50 --> 60
        //                          ^
        //                        middle
        // IMPORTANT:
        // For an even-sized list, return the SECOND
        // middle node.

        Node currNode = head;
        int count = 0;

        while (currNode != null) {
            ++count;
            currNode = currNode.next;
        }

        int middle = count/2;

        count = 0;
        currNode = head;

        while (currNode != null && count != middle) {
            ++count;
            currNode = currNode.next;
        }

        return currNode;
    }

    public void deleteMiddle() {

        // TODO:
        // Step 1: Count the total number of nodes.
        // Step 2: Find the node before the middle node.
        //         Then change its next reference so that
        //         the middle node is removed from the list.
        //
        // Remember:
        // - For an odd number of nodes, delete the middle.
        // - For an even number of nodes, delete the SECOND middle.
        // - If there is only one node, the list becomes empty.

        if (head.next == null ) {
            head = null;
            return;
        }

        Node currNode = head;

        Node middleNode = this.findMiddle();

        while (currNode.next != null && currNode.next != middleNode) {
            currNode = currNode.next;
        }

        currNode.next = middleNode.next;
    }

    // -------------------------------------------------------
    // Get the head
    public Node getHead() {
        return head;
    }
}