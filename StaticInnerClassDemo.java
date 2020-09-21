
public class StaticInnerClassDemo {
static int a=5;
int x;
StaticInnerClassDemo()
{
	x=30;
}
	static class InnerClass  //Member
	{
		int b;
		InnerClass()
		{
			b=10;
		}
		static void display()
		{
			System.out.println("display");
		}
		void display2()
		{
			System.out.println("b="+b+"a="+a);// "x="+x); x can not be accessed
		}
	
	}
	public static void main(String[] args) {
		
System.out.println(StaticInnerClassDemo.a);
StaticInnerClassDemo.InnerClass.display();
StaticInnerClassDemo.InnerClass ob=new InnerClass();
ob.display2();
	}

	//Create one Outerclass named as College ,create innerclass named as 
	//department using 3 types.
}
