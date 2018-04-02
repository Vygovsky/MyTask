package dobroe.lesson3.task3;

/**
 * Created by Roman_v on 01.04.2018.
 */
public class DemoAnimals {

    public Animal[] getCatOfAge(Animal[] animals) {
        int res = 0;
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                if (animal.getAge() > 8 | animal.getAge() < 1) {
                    System.out.println("удаление кота " + animal.getName());
                } else {
                    res++;
                }
            }
        }
        return new Animal[4];
    }


    public void deleteAnimals(Animal[] animals) {
        int res = 0;
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                if (animals[i].getAge() > 8 | animals[i].getAge() < 1) {
                    System.out.println("Коты которые не соответствуют возрасту " + animals[i].getName());
                }
            }
        }
    }

    public Animal[] remove(Animal[] animals) {
        for (int i = 0; i < animals.length; i++) {
            if (animals[i] instanceof Cat) {
                if (animals[i].getAge() > 8 | animals[i].getAge() < 1) {
                    System.out.println("Коты которые не соответствуют возрасту " + animals[i].getName());
                    Animal[] copy = new Animal[animals.length - 1];
                    System.arraycopy(animals, 0, copy, 1, animals.length-1);
                  //  System.arraycopy(animals, 0, copy, 0, animals.length - i - 1);
                //    return copy;
                }
            }
        }
        return animals;
    }

    char[] vowel = new char[]{'а', 'о', 'и', 'э', 'у', 'я', 'е', 'ю', 'ё'};

    public boolean isVowel(char c) {
        c = Character.toLowerCase(c);

        for (char charLetter : vowel) {
            if (c == charLetter) return true;
        }
        return false;
    }
}

