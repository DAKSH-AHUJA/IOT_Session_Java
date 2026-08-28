package day8;

public class ReversedList {
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
		Node previous =  null;
		Node current = first;
		while (current != null) {
			Node next = current.next;
			previous = current;
			current = next;
		}
		current = previous;
		while(current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}
		System.out.println("Null");
		
	}
}
