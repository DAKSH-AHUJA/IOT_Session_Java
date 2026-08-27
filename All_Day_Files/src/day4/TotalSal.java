package day4;

public class TotalSal {
	public static void main(String[] args) {
//		int emp1 = 10000;
//		int emp2 = 15000;
//		int emp3 = 12000;
//		int emp4 = 18000;
//		int emp5 = 20000;
		
		int[] a = {10000, 15000, 12000, 18000, 20000};
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("Total sal is: "+sum);
		
		//int TotSal = (emp1 + emp2 + emp3 +emp4 + emp5);
		//System.out.println("Total salary is: " + TotSal);

	}
}
