package task3;

public class Classes {
    private class One {
    }

    protected class Two {
    }

    class Three {
    }

    public class Four {
    }

    private static class StaticOne {
    }

    static protected class StaticTwo {
    }

    static class StaticThree {
    }

    static public class StaticFour {
    }

    public void test() {
        One inOne=new One();
        Two inTwo=new Two();
        Three inThree=new Three();
        Four inFour=new Four();

        StaticOne inStatOne=new StaticOne();
        StaticTwo inStatTwo= new StaticTwo();
        StaticThree inStatThree= new StaticThree();
        StaticFour inStatFour= new StaticFour();

    }

}



