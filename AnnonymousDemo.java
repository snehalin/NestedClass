
public class AnnonymousDemo {

	void display()
	{
		InterfaceA ob=new InterfaceA()
		{	@Override
			public void m1() {
			System.out.println("m1");
			
		}
		@Override
		public void m2() {
		System.out.println("m2");			
				}
	
		};//childclass of InterfaceA
		ob.m1();
		ob.m2();
	}
	
	
	public static void main(String[] args) {
		
		AnnonymousDemo o1=new AnnonymousDemo();
		o1.display();
				
		
		

	}

}
