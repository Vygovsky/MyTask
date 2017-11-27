package Preobrazovanie;

import java.io.UnsupportedEncodingException;

public class Preobrazovanie {
    public static void main(String[] args) {
        try {
            Byte b1 = new Byte("10");
            System.out.println(b1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        String s = "111";
        try {
            Byte b = Byte.valueOf(s);
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        Byte b = 0;
        String s2 = "100";
        try {
            b = Byte.parseByte(s2);
            System.out.println(b);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        String s3 = "1280098";
        byte[] b3 = s3.getBytes();
        System.out.println(b3);

        /*try {
            String s4=new String(b3,"cp15220");
            System.out.println(s4);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }*/
        /////////////////SHORT///////////////////////
        try {
            short sh1 = 100;
            System.out.println(sh1);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }
        String srt2 = "1588";
        try {
            Short sh3 = Short.valueOf(srt2);
            System.out.println(sh3);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }


        String srt = "1002";
        try {
            Short sh2 = Short.parseShort(srt);
            System.out.println(sh2);
        } catch (NumberFormatException e) {
            System.err.println("Неверный формат строки!");
        }

        String b1 = "True";
        String b2 = "yes";
        boolean bool1, bool2, boolean3, boolean4;

        bool1 = Boolean.parseBoolean(b1);
        bool2 = Boolean.parseBoolean(b2);
        System.out.println(bool1);
        System.out.println(bool2);

        boolean3 = Boolean.valueOf(b1);
        boolean4 = Boolean.valueOf(b2);
        System.out.println(boolean3);
        System.out.println(boolean4);

        int i = 52;
        String num = Integer.toString(i);
        System.out.println(num);

        double d = 32.4e10;
        String num2 = Double.toString(d);
        System.out.println(num2);

        char ch = 'S';
        String charToString = Character.toString(ch);
        System.out.println(charToString);

        String str3 = " " + ch;
        System.out.println(str3);

        String fromChar = new String(new char[]{ch});
        System.out.println(fromChar);

        String valueChar = String.valueOf(ch);
        System.out.println(valueChar);

        char ch2 = '9';
        int i2 = Character.getNumericValue(ch2);
        System.out.println(i2);
        int i3=Character.digit(ch, 10);
        System.out.println(i3);

    }

}
