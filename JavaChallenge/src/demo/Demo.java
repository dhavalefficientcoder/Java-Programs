package demo;

public class Demo {


		public static void main() {
			
			C11 obj1 = new C11();
			obj1.d2();
		
		}
		
	}

interface I1{
		
		void d2();
		
		default void d1() {
			System.out.println("d1 of I1");
		}
	}
	
	interface I2{
		void d2();
		
		default void d1() {
			System.out.println("d1 of I2");
		}
		
	}
	
	class C11 implements I1,I2 {

		@Override
		public void d2() {
			// TODO Auto-generated method stub
			
		}
		

		
	}
	
	
	

