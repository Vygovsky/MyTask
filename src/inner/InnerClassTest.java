package inner;

public class InnerClassTest {
    int i = 5;
    static int q=96;

    static class InnerStatic{
       static void methodStatic(){
           System.out.println(q);
        }
    }

    public static void main(String[] args) {
        InnerStatic.methodStatic();

        InnerClassTest test = new InnerClassTest();
        test.inner();
        Inner inner = test.new Inner();
        inner.method2();
    }

    void inner() {
        Inner inner = new Inner();
        inner.method2();
        System.out.println(inner.k);
    }

    class Inner {
        private int k = 3;

        void method2() {
            System.out.println(i);
        }
    }
}

class SecondInner {
    void method() {
        InnerClassTest.Inner inner2 = new InnerClassTest().new Inner();
        inner2.method2();
    }
}

