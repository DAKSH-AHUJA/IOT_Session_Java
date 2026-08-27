package day7;

public class BackTrackingEx {
		static String correctPassword = "231";
		static void tryPassword(String password) {
			System.out.println("Password found: " + password);
			
			if(password.equals(correctPassword)) {
				System.out.println("Password found: " + password);
				return;
			}
			System.out.println("Wrong password. Go back and try another");
		}

	
	public static void main(String[] args) {
		tryPassword("123");
		tryPassword("345");
		tryPassword("213");
		tryPassword("365");
		tryPassword("231");

	}
}
