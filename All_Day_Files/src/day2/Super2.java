package day2;
class parent4
{
   int a =10;
		   int b =20;
}

public class Super2 extends parent4 {
	int a=20;
	int b =30;
	
	void add(int a , int b)
	{
		System.out.println(super.a+super.b);
		System.out.println(this.a+this.b);
		System.out.println(a+b);
	}
public static void main(String[] args) {
	Super2 jj = new Super2();
	jj.add(2, 3);
	
}
}