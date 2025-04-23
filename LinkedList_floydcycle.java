// LinkedList_Floyd Cycle
// Success rate: 18.14%
// Given the head of a singly linked list, return the node where a cycle begins. If there is no cycle, return null.

// A cycle exists in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. The position where the cycle starts is denoted by the index of the node (0-indexed) to which the tail's next pointer is connected. If there is no cycle, the function should return null.

// You must not modify the linked list.

// Input Format:
// The first line contains an integer n, the number of nodes in the linked list.
// The second line contains n space-separated integers representing the node values of the linked list.
// The third line contains an integer pos, representing the index where the tail connects to form a cycle (-1 if there is no cycle).

// Output Format:
// Output the value of the node where the cycle begins. If no cycle exists, output null.

// Constraints:
// The number of the nodes in the list is in the range [0, 104].
// -105 <= Node.val <= 105
// pos is -1 or a valid index in the linked-list

// Sample test cases
// Input
// Expected output
// 3
// 1 2 3
// -1
// null

import java.util.Scanner;


public class LinkedList_floydcycle {
	static class Node{
		int val;
		Node next ;
		public Node(int val){
			this.val=val;
	
		}
		public Node(){
			
		}
	}
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		Node head = new Node(s.nextInt());
		Node current = head;
		for(int i=1;i<n;i++){
			current.next = new Node(s.nextInt());
			current = current.next;
		}
		head = FloydCycle(head);
	
	}
	public static Node FloydCycle(Node head){
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){
                // Cycle detected
                slow = head;
                while(slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow; // starting node of cycle
            }
        }
        return null; // No cycle
    }

	
}