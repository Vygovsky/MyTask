package examples.Exception;

public class Start2 {
    public static void main(String[] args) {
        Generator2 g2 = new Generator2();
        try {
            String s1 = g2.helloMes("8");
            System.out.println("Test " + s1);

        } catch (FirstException e) {
            System.out.println("Error " + e.getMessage());
        } catch (SecondException e) {
            System.out.println("Error " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

    }
}
