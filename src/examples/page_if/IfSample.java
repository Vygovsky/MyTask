package examples.page_if;

import org.junit.Assert;
import org.junit.Test;

public class IfSample extends AbstractSample {
    public static void main(String[] args) {
        int a = anInt();
        int b = anInt();
        boolean var = (a == b);
        /* boolean var1 = (a != b);
        boolean var2 = (a > b);
        boolean var3= (a < b);
        boolean var4= (a <= b);
        boolean var5= (a >= b);
       */

        if (var) {
            System.out.println("oni ravni");
        } else {
            System.out.println("oni ne ravni");
        }

    }

    @Test
    public void ternaryIf() {
        int largerNum;
        int lowNum = 9;
        int highNum = 30;
        if (lowNum < highNum) {
            largerNum = highNum;
        } else {
            largerNum = lowNum;
        }
        Assert.assertEquals(30,largerNum);
        System.out.println(largerNum);
    }
    @Test
    public void ternaryIf2() {

        int lowNum = 9;
        int highNum = 30;
        int largerNum = (lowNum < highNum) ? highNum : lowNum;
        System.out.println(largerNum);


    }
}
