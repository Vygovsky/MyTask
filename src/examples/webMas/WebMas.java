package examples.webMas;


public class WebMas {
    public static void main(String[] args) {
    int[]array=new int[7];
    int v=1;
        for (int i = 0; i <array.length ; i++) {
            array[i]=v;
            v*=2;
            System.out.println(array[i]);
        }
    }

}
