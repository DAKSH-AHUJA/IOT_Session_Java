package day3;

public class Demo {
	public static void main(String[] args) {
		
		try {
			System.out.println(10 / 2);//can be 0 // wherever it catches an error in a line the next lines are not being executed directly it goes to catch block
			int[] a = {10,20,30};
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);
			System.out.println(a[3]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Array handeled");
		}
		catch (ArithmeticException e) {
			System.out.println("Arithmetic exception handeled");
		}
		catch (Exception e) {
			System.out.println("exception handeled");
		}
		System.out.println("Hello sir");
	}
}
