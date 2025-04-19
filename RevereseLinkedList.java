// LinkedList_Reverse LinkedList
// Success rate: 16.07%
// Given the head of a singly linked list, reverse the list, and return the reversed list.

// Input Format:
// An integer n representing the number of nodes in the linked list.
// n integers representing the elements of the linked list.

// Output Format:
// Print the elements of the reversed linked list.

// Constraints:
// The number of nodes in the list is the range
// [0, 5000].
// -5000 <= Node.val <= 5000

// Sample test cases
// Input
// Expected output
// 5
// 1 2 3 4 5
// 5 4 3 2 1 
import java.util.Scanner;

public class RevereseLinkedList {

    // Node definition as a static inner class
    static class Node {
        int val;
        Node next;
        Node(int v) { this.val = v; }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       

        // build the list
        Node head = new Node(s.nextInt());
        Node curr = head;
        for (int i = 1; i < n; i++) {
            curr.next = new Node(s.nextInt());
            curr = curr.next;
        }
        s.close();

        // reverse and print
        head = reverseLL(head);
        Node it = head;
        while (it != null) {
            System.out.print(it.val + " ");
            it = it.next;
        }
    }

    // Reverse the linked list in-place; returns new head
    public static Node reverseLL(Node head) {
        Node prev = null, curr = head;
        while (curr != null) {
            Node nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
}
