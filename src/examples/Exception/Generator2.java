package examples.Exception;

public class Generator2 {
    public String helloMes(String name) throws FirstException, SecondException {
        if ("First".equals(name)) {
            throw new FirstException("FirstException occured");
        }
        if ("Second".equals(name)) {
            throw new SecondException("SecondException occured");
        }
        return name;
    }
}
