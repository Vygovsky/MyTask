package task1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RemoveSubString {
    public static void main(String[] args) {
        String regex = "Hello there";
        StringBuilder sb = new StringBuilder(regex);
        Pattern pattern= Pattern.compile("ll");
        Matcher matcher=pattern.matcher(sb);
        while (matcher.find()){
            System.out.println(sb.delete(2,3));



        }


    }
}
