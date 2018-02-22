package task3;

public class A {
    public static int t = 13;
    public int b = 103;

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
      //  System.out.println(A.t);
        A.t = -199;
        a2.b = -13;
     //   System.out.println(a1.b);
        System.out.println(a1.b);
    }
}
