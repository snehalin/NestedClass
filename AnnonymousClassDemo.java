class Abc
{
	void m()
	{
		System.out.println("abc");
	}
}
/*
 * class D extends Abc { void m() { System.out.println("D"); }
 * 
 * }
 */

public class AnnonymousClassDemo {

		
	public static void main(String[] args) {
		Abc ob=new Abc()  //Annonymous class
		{
			void m()
			{
				System.out.println("D");
			}
		};
       ob.m();
       Abc ob2=new Abc();
       ob2.m();

	}

}
