package serialaz.serial;

import examples.Object.Object;

import java.io.*;

public class SerialTest {
    public static void main(String[] args) throws Exception {
        Hero hero = new Hero();
        hero.level = 55;
        Sword sword = new Sword();
        sword.level=5;
        hero.sword=sword;

        FileOutputStream outputStream = new FileOutputStream("Temp.Level");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
        objectOutputStream.writeObject(hero);
        objectOutputStream.close();

        FileInputStream fileInputStream = new FileInputStream("Temp.Level");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
        Hero newHero = (Hero) objectInputStream.readObject();
        objectInputStream.close();
        System.out.println(newHero.level);
        System.out.println(newHero.sword);

    }

}
