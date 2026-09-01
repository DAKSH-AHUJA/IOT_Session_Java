package day6;

public class DemoWindow {
	public static void main(String[] args) {
		int[] numbers = {2, 3, 1, 2, 4, 3};
		int target = 7;
		int start = 0;
		int sum = 0;
		int minLength = numbers.length; //6
		for (int end = 0; end < numbers.length; end++) {
			sum = sum + numbers[end]; // 2
			while(sum >= target) { // 8 - end = 4
				int length = end - start + 1; //3
				if (length < minLength) {// 3<4
					minLength = length; //min = 3
				}
				sum = sum - numbers[start];
				start++;
			}
		}
		System.out.println("Smallest window length = " + minLength);
	}
}
