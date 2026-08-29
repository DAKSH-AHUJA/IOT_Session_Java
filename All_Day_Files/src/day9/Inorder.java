package day9;
//Binary search tree

public class Inorder {
		
		static class Node{
			int data;
			Node left;
			Node right;
			Node(int data) {
				this.data = data;
			}
		}
		// Recursive method
		static void inorder(Node root) {
			if(root == null) {
				return;
			}
			// 1. visit left tree
			inorder(root.left);
			// 2. Visit root
			System.out.print(root.data + " ");
			// 3. Visit right tree
			inorder(root.right);
			
	}
	
		public static void main(String[] args) {
			//create tree
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			//start traversal
			inorder(root);
		}
	
}

