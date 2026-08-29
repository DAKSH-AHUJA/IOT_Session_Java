package day9;

public class SegmentTree {
	static int[] tree = new int[20];

	static void build(int[] arr, int node, int start, int end) {
		if (start == end) {
			tree[node] = arr[start];
			return;
		}
		int mid = (start + end) / 2;
		build(arr, node * 2, start, mid);
		build(arr, node * 2 + 1, mid + 1, end);

		tree[node] = Math.max(tree[node * 2], tree[node * 2 + 1]);
	}

	static int findMax(int node, int start, int end, int left, int right) {
		if (start >= left && end <= right) {
			return tree[node];
		}

		if (end < left || start > right) {
			return Integer.MIN_VALUE;
		}

		int mid = (start + end) / 2;

		int a = findMax(node * 2, start, mid, left, right);
		int b = findMax(node * 2 + 1, mid + 1, end, left, right);

		return Math.max(a, b);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 6, 5, 3, 7 };

		build(arr, 1, 0, arr.length - 1);

		int result = findMax(1, 0, arr.length - 1, 1, 5);

		System.out.println("Maximum = " + result);
	}
}
