package examples.InitField;

public class InitField {
    protected static String staticField;
    protected String field;

    static {
          staticField="Static Test";
           System.out.println("Static init: "+staticField);
    }

    {
        field = "Test";
        System.out.println("Object init: " + field);
    }

  /*  {
        staticField = "111";
        System.out.println("GGGGG");
    }*/

    public static void main(String[] args) {
        /*InitField init1 = new InitField();
        System.out.println(init1.field);
        InitField init2 = new InitField();
        System.out.println(init2.field);*/
        InitTwo initTwo=new InitTwo();
        System.out.println(initTwo.field);
    }
}

