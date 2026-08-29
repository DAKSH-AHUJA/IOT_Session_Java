package day9;


public class PostOrder {
		
		static class Node{
			int data;
			Node left;
			Node right;
			Node(int data) {
				this.data = data;
			}
		}
		// Recursive method
		static void postorder(Node root) {
			if(root == null) {
				return;
			}
			// 1. visit left tree
			postorder(root.left);
			// 2. Visit right tree
			postorder(root.right);
			// 3. Visit root
			System.out.print(root.data + " ");
			
	}
	
		public static void main(String[] args) {
			//create tree
			Node root = new Node(1);
			root.left = new Node(2);
			root.right = new Node(3);
			root.left.left = new Node(4);
			root.left.right = new Node(5);
			//start traversal
			postorder(root);
		}
	
}
