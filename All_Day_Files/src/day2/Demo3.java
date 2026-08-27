package day2;


interface Atm
{
	abstract void depo();
}
interface Atm1
{
	abstract void min();
}
//This is the abstract class example
/*
abstract class Abc implements Atm, Atm1
{
	public void depo()
	{
		System.out.println("depo");
	}
	public void min() {
		System.out.println("min");
	}
}
*/

public class Demo3 implements Atm , Atm1
{
	public void depo() {
		System.out.println("dep");
	}
	
	public void min()
	{
		System.out.println("with");
	}
	
	public static void main(String[] args) 
	{
		Demo3 v = new Demo3();
		v.depo();
		v.min();
		
	}
}
