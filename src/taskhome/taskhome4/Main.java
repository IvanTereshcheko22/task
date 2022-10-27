package taskhome.taskhome4;

import java.util.Random;

public class Main {
    public int catAge;
    public String catName;

    public Main(int age, String name) {
        catAge= age;
        catName = name;
    }

    public static void main(String[] args) {
        Cat.firstCycle();
        Cat cat = new Cat(randomAge(),randomName());
        Cat.secondCycle();
        Cat.thirdCycle();
        Cat.fourhtCycle();
    }

    public String toString() {
        return "Cat age is " + catAge + "\n Cat is name - " + catName;
    }

    public static String randomName() {
        String str;
        String catName = " ";
        for (int i = 0; i < 5; i++) {
            Random rand = new Random();
            str = String.valueOf((char) (rand.nextInt(26) + 'A'));
            catName = catName + str;
        }
        return catName;
    }

    public static int randomAge() {
        Random random = new Random();
        return random.nextInt(27) + 1;
    }
}
