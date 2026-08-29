package day9;

public class PreOrder {
		
		static class Node{
			int data;
			Node left;
			Node right;
			Node(int data) {
				this.data = data;
			}
		}
		// Recursive method
		static void preorder(Node root) {
			if(root == null) {
				return;
			}
			// 1. Visit root
			System.out.print(root.data + " ");
			// 2. visit left tree
			preorder(root.left);
			// 3. Visit right tree
			preorder(root.right);
	}
	
		public static void main(String[] args) {
			//create tree
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			//start traversal
			preorder(root);
		}
	
}
