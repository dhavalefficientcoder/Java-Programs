
package p1;

class C1 {

    public static void main(String[] args) {
        System.out.println("Entering Main");
        p2.C3.m4();
        m1();
        System.out.println("Leaving Main");
    }
    
    static void m1(){
        System.out.println("Entering m1");
        p2.p3.C4.m7();
        System.out.println("Leaving m1");
    }
    
}

public class C2{
    public static void m2(){
        System.out.println("Entering m2");
        m3();
        System.out.println("Leaving m2");
    }
    
    public static void m3(){
        System.out.println("Entring m3");
        System.out.println("Leaving m3");
    }
}
