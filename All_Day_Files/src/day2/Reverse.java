package day2;

public class Reverse {
	public static void main(String[] args) {
		
		String str = "Kishore";
		String reverse = "";
		
		for (int i = str.length() - 1; i >= 0 ; i-- ) {
			reverse = reverse +str.charAt(i);
		}
		
		System.out.println("Original String: " + str);
		System.out.println("Original String: " + reverse);

		
	}
}
