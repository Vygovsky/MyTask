package examples.Exception;

public class Generator {
    public String helloMessage(String name) throws TestException {
        if (name == null) {
            TestException te = new TestException(10, "Message is null");
            throw te;
        }
        return "Hello " + name;
    }


}
