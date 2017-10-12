package examples.webMas;



public class WebMas {
    public static void main(String[] args) {
        System.out.println(addtoString("1234567890",'c'));

    }
    public static StringBuffer addtoString(String s,char c){
        StringBuffer sb=new StringBuffer(s);
        int p=0;
        for (int i = 1; i <sb.length() ; i++) {
            if(i%3==0){
                sb.insert(sb.length()-i-p,c);
                p++;
            }
        }
        return sb;
    }
}
 /*Integer  i1=10;
        Integer  i2= 10;
        if(i1==i2){
            System.out.println("true");
        }else {
            System.out.println("false");
        }*/