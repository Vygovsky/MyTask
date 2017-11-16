package examples.InitField;

public class InitTwo extends InitField {
    static {
        staticField="Other";
        System.out.println("InitTwo Static init: "+staticField);
    }
    {
        field="Other";
        System.out.println("Object init two: "+field);
    }

    /*public static void main(String[] args) {
        InitTwo initTwo=new InitTwo();
        System.out.println(initTwo.field);
    }*/
}
