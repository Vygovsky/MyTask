package examples.Exception;

public class Start {
    public static void main(String[] args) {


        Generator g = new Generator();
        try {
            String text = g.helloMessage(null);
            System.out.println("Text= " + text);
        } catch (TestException e) {
            System.out.println("Error code: " + e.getErrorCode());
            System.out.println("Error massage: " + e.getMessage());
        } finally {
            System.out.println("Этот блок вызывается всегда");
        }

        try {
            String name2 = g.helloMessage("Yoda");
            System.out.println("Name " + name2);
        } catch (TestException e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("Этот блок вызывается всегда");
        }
    }
}