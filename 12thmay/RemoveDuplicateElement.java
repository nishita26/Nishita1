package twelve_may;


public class RemoveDuplicateElement {
	 static class Node {
	        int data;
	        Node next;
	        Node(int tmp) {data = tmp;}
	    }
	 
	    static void printLinkedList(Node head) {
	        while(head != null) {
	            System.out.print(head.data+" ");
	            head = head.next;
	        }
	    }
	 
	    static void deleteDuplicates(Node head) {
	        Node curr = head;

	        while(curr != null) {

	            Node temp = curr;
	            while(temp != null && temp.data == curr.data) {
	                temp = temp.next;
	            }

	            curr.next = temp;
	            curr = curr.next;
	        }
	    }
	 
	    public static void main(String[] a) {
	 
	        Node n1 = new Node(10);
	        Node n2 = new Node(20);
	        Node n3 = new Node(20);
	        Node n4 = new Node(30);
	        Node n5 = new Node(30);
	        Node n6 = new Node(40);
	        Node n7 = new Node(40);
	        n1.next = n2;
	        n2.next = n3;
	        n3.next = n4;
	        n4.next = n5;
	        n5.next = n6;
	        n6.next = n7;
	 
	        System.out.print("Initial linked list data: ");
	        printLinkedList(n1);
	        deleteDuplicates(n1);
	        System.out.println();
	        System.out.print("Linked list data after removing duplicate elements: ");
	        printLinkedList(n1);
	}
}