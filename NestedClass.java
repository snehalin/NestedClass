/*
 Nested class
 1.MemberInnerClass--->Outside method
 2.LocalInnerClass---->Inside method
 3.StaticInnerClass--->outside method and static 
 4.AnnonymousInnerClass-->outside/inside method
  
  
  class OuterClass
 {
  void m()
  {
  
  }
 
 
 }
 */
public class NestedClass {
	int a;
	NestedClass()
	{
		a=10;
	}
	void m()
	{
		//m2();
		 System.out.println("in method a="+a+" ");
	}
	 
	class InnerClass//MemberInner
	{
	  int b;
	  InnerClass()
	  {
		  b=20;
	  }
	  void m2()
	  {
		  m();
		  System.out.println("in method m2 a="+a+"b="+b);  
	  }
	
	}
	
	public static void main(String args[])
	{
		NestedClass ob=new NestedClass();
		NestedClass.InnerClass  ob2=ob.new InnerClass();
		ob2.m2();
		//ob.m();
	}
	
}
