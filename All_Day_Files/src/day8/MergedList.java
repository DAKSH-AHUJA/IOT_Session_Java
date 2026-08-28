package day8;

public class MergedList {
	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
		}
	}
	public static void main(String[] args) {

		Node first1 = new Node(10);
		first1.next = new Node(30);
		first1.next.next = new Node(50);

		Node first2 = new Node(20);
		first2.next = new Node(40);
		first2.next.next = new Node(60);

		Node first = null;
		Node last = null;

		while (first1 != null && first2 != null) {

			Node newNode;

			if (first1.data < first2.data) {
				newNode = first1;
				first1 = first1.next;
			} else {
				newNode = first2;
				first2 = first2.next;
			}

			if (first == null) {
				first = newNode;
				last = newNode;
			} else {
				last.next = newNode;
				last = newNode;
			}
		}

		if (first1 != null) {
			last.next = first1;
		}

		if (first2 != null) {
			last.next = first2;
		}

		Node current = first;

		while (current != null) {
			System.out.print(current.data + " -> ");
			current = current.next;
		}

		System.out.println("Null");
	}
}
