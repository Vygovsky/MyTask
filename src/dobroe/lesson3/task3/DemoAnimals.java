package dobroe.lesson3.task3;

/**
 * Created by Roman_v on 01.04.2018.
 */
public class DemoAnimals {

    public Animal[] deleteAnimals(Animal[] animals) {
        int res = 0;
        for (int i = 0; i < animals.length; i++) {
            if ((animals[i] instanceof Cat)) {
                if (animals[i].getAge() > 8 || animals[i].getAge() < 1) {
                    System.out.println("Кот который не соответствует возрасту " + animals[i].getName() + ".");
                    animals[i] = null;
                    res++;
                }
            }
        }

        Animal[] animalsNew = new Animal[animals.length - res];
        for (int i = 0; i < animals.length; i++) {
            System.arraycopy(animals, 0, animalsNew, 0, res);
        }
        return animalsNew;
    }

    static char[] vowel = new char[]{'а', 'о', 'и', 'э', 'у', 'я', 'е', 'ю', 'ё'};

    public static boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char charLetter : vowel) {
            if (c == charLetter) return true;
        }
        return false;
    }

    public Animal[] getNameDogs(Animal[] animals) {
        int res = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Dog) {
                if (isApropriateName(animals[i].getName())) {
                    animals[i] = null;
                    res++;
                }
            }
        }
        Animal[] animalsNewDog = new Animal[animals.length - res];
        for (int i = 0; i < animals.length; i++) {
            System.arraycopy(animals, 0, animalsNewDog, 0, res);
        }
        return animalsNewDog;
    }

    private static boolean isApropriateName(String name) {
        int consonants = 0;
        for (int i = 0; i < name.length(); i++) {
            if (!isVowel(name.charAt(i))) {
                consonants++;
            }
        }
        if (consonants > 4) {
            System.out.println("Животное которое имеет больше 4 согласных букв будет удалено из списка = " + name);
            return true;
        }
        return false;
    }
}

