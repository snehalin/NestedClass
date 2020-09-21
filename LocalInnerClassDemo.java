public class LocalInnerClassDemo {
int a;
LocalInnerClassDemo()
{
	a=20;
}
	void outermethod()
	{
		 int x=10;//local variable
		 class InnerClass   //Local Inner Class
		{
			int b;
			InnerClass()
			{
				b=20;
			}
			void display()
			{
				System.out.println("a="+a+"b="+b);
			}
		}
		
		System.out.println("hello"+x);
		InnerClass i=new InnerClass();
		i.display();
	}	
	public static void main(String[] args) {
		LocalInnerClassDemo ob=new LocalInnerClassDemo();
           ob.outermethod();
         //  LocalInnerClassDemo.InnerClass  ob2=ob.new InnerClass();
	}

}
