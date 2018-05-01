
package p2;

public class C3 {

	public static void m4() {
		System.out.println("Entering m4");
		m5();
		System.out.println("Leaving m4");
	}

	public static void m5() {
		System.out.println("Entring m5");
		p1.C2.m2();
		p2.p3.C4.m6();
		System.out.println("Leaving m5");
	}
}
