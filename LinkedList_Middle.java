// LinkedList_Middle of LinkedList
// Success rate: 25.93%
// Problem Statement
// Given the head of a singly linked list, find and return the middle node of the linked list. If the list has an even number of nodes, return the second of the two middle nodes.

// Input Format:
// The first line contains an integer n, the number of nodes in the linked list.
// The next n lines each contain an integer, representing the values of the nodes in the linked list.

// Output Format:
// Print the value of the middle node in the linked list.

// Constraints:
// The number of nodes in the list is in the range [1, 100].
// 1 <= Node.data <= 100

// Sample test cases
// Input
// Expected output
// 5
// 1 2 3 4 5
// 3
import java.util.Scanner;

public class LinkedList_Middle {
	public static void main(String[] args) {
		// write your code here
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();

		Node head = new Node(s.nextInt());
		Node current = head;

		for(int i=1;i<n;i++){
			current.next=new Node(s.nextInt());
			current = current.next;
		}
		head = middle(head);

		System.out.print(head.val);


	}
	static class Node{
		int val;
		Node next;

		public Node(int val){
			this.val=val;
		}
		public Node(){

		}
	}

	public static Node middle(Node head){
		Node slow = head ;
		Node fast = head;
		
		while(fast.next!=null && fast.next.next!=null){
			slow = slow.next;
			fast = fast.next.next;
		}
		

		

		return slow;


	}
}