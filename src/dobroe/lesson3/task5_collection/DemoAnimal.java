package dobroe.lesson3.task5_collection;

import java.util.Iterator;
import java.util.List;

public class DemoAnimal {

    public void deleteAnimals(List<Animal> animals) {
        for (Iterator iter = animals.iterator(); iter.hasNext(); ) {
            if (animals instanceof Cat) {
                /*int age = iter.next().;
                if (age > 8 || age < 1)*/
                System.out.println("Кот который не соответствует возрасту " + iter + ".");
                iter.remove();
            }
        }
    }

    static char[] vowel = new char[]{'а', 'о', 'и', 'э', 'у', 'я', 'е', 'ю', 'ё'};

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char charLetter : vowel) {
            if (c == charLetter) return true;
        }
        return false;
    }

    public List<Animal> getNameDogs(List<Animal> animals) {
        for (Iterator iter = animals.iterator(); iter.hasNext(); ) {
            String nameDog = iter.next().getName();
            if (animals instanceof Dog)
                if (!isAppropriateName(nameDog)) {
                    animals.remove(nameDog);
                    System.out.println("Животное которое имеет больше 4 согласных букв будет удалено из списка = " + nameDog);
                }

        }
        return animals;
    }


    private static boolean isAppropriateName(String name) {
        int consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            if (!isVowel(name.charAt(i))) {
                consonants++;
            }
        }
        return consonants <= 4;
    }
}

