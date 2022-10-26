package taskhome.taskhome4;

import javax.naming.Name;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class Cat {
    static String name = "Barsik";
    static int age = 5;
    static int numberCat = 0;

    public static void firstCycle() {
        while (numberCat < 10) {
            numberCat++;
            System.out.println("Number cat " + numberCat + " Name " + name + " age " + age);
        }
    }
public static void Name(){
    int length = 10;
        System.out.println(randomeName(length));
}

    public static char[] randomeName(int len) {
        System.out.println("Cat name: ");
        String charsCaps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        Random rnd = new Random();
        char[] name = new char[len];

        for (int i = 0; i < len; i++) {
            name[i] = charsCaps.charAt(rnd.nextInt(charsCaps.length()));
        }
        return name;
}




    }











