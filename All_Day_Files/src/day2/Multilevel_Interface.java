package day2;


interface Atm2
{
	abstract void depo();	
	abstract void with();
}
abstract class Abc implements Atm2
{	
	public	void depo()
	{
		System.out.println("Depos");
	}
}

public class Multilevel_Interface extends Abc{

		public	void with()
		{
			System.out.println("With");
		}

		
	public static void main(String[] args) {
		Multilevel_Interface   v = new Multilevel_Interface();
		v.depo();
		v.with();
	}
	}


