package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RemoveSubString {
    public static void main(String[] args) {
        String regex = "Helloll therell";
        System.out.println(regex.replace("ll",""));
     /*   String rem = "ll";
        StringBuilder sb = new StringBuilder(regex);
        int startIndex=-1;
        while ((startIndex=sb.indexOf("ll"))>0){
            sb.delete(startIndex,startIndex+rem.length());
        }

       System.out.println(sb);
       */
    }

}
