package day10;

import java.util.PriorityQueue;

public class MaxHeap {
		public static void main(String[] args) {
			
			PriorityQueue<Integer> maxHeap = new PriorityQueue<>();
			
			maxHeap.add(30);
			maxHeap.add(10);
			maxHeap.add(20);
			maxHeap.add(5);

			System.out.println("Man Heap: " + maxHeap);
			System.out.println("Largest element: " + maxHeap);
		}
	

    }

