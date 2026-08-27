package day2;
import java.util.Scanner;
public class AdditionMultipleNumLoop {
		public static void main(String args[]) {

			Scanner sc= new Scanner(System.in);

			int sum = 0;

			System.out.print("enter any 5 numbers");

			int[] a = new int[5];

			for(int i=0; i<=4;i++) {

				a[i]=sc.nextInt();

			}

			for(int i =0; i<=4;i++) {

				 sum = sum +a[i];

			}

			System.out.print("sum" +sum);
			sc.close();

		}

	}