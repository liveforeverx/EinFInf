package exercise12;

public class Hierarchy {
    public static void main(String[] args) {
        A a1 = new B();
        C c1 = new C();
        B b2 = new C();
        A a3 = c1;
        System.out.print(a3.msg1());
        System.out.print(a3.msg2());
        System.out.print(b2.msg3());
        
    }
}
