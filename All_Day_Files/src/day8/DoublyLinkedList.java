package day8;

public class DoublyLinkedList {
	static class Node{
		int data;
		Node previous;
		Node next;
		Node (int data){
			this.data = data;
		}
	}
	
	public static void main(String[] args) {
		Node first = new Node(10);
		Node second = new Node(20);
		Node third = new Node(30);
		first.next = second;
		second.next = third;
		second.previous = first;
		third.previous = second;
		Node current = first;
		System.out.println("Forword:");
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		current = third ;
		System.out.println("\nBackground:");
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.previous;
		}
	}
}
