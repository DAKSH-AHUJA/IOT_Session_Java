package day4;

import java.util.HashSet;

public class PatternRecog {
	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30 , 20, 40};
		
		HashSet<Integer> set = new HashSet<>();
		
		for(int number : numbers) {
			
			if (set.contains(number)) {
				System.out.println("Duplicaates: "+ number);
				
			}else {
				set.add(number);
			}
			
		}
	}
}
