package taskhome.taskhome4;
public class Cat {
     final private static String name = "Barsik";
     final private static int age = 5;
    private static String cat_name;
    private static int cat_age;

    public Cat(int age, String name) {
        cat_age = age;
        cat_name = name;
    }

    public static void firstCycle() {
        int cat_number = 1;
        System.out.println("\nFirst cycle \n");
        while (cat_number <= 10) {
            System.out.println("Cat number " + cat_number + ": " + " Age is " + age + "; Name is " + name);
            cat_number++;
        }
    }

    public static void secondCycle() {
        System.out.println("\nSecond cycle \n");
        for (int i = 1; i <= 10; i++) {
            setAge(Main.randomAge());
            setName(Main.randomName());
            System.out.println("Cat number " + i + ": Age is " + getAge() + "; Name is " + getName());
        }
    }
    public static String getName() {
        return cat_name;
    }
    public static void setName(String cat_name) {
        Cat.cat_name = cat_name;
    }
    public static int getAge() {
        return cat_age;
    }
    public static void setAge(int cat_age) {
        Cat.cat_age = cat_age;
    }

    public static void thirdCycle() {
        System.out.println("\nThird cycle \n");
        int numberCat = 1;
        do {
            System.out.println("Cat number " + numberCat + ": Age is " + cat_age + "; Name is " + cat_name);
            numberCat++;
        } while ( numberCat <= 10);
    }

    public static void fourhtCycle() {
        System.out.println("\nFourth cycle \n");
        Main[] cats = new Main[5];
        for (int j = 0; j < cats.length; j++) {
            cats[j] = new Main(Main.randomAge(), Main.randomName());
        }
        for (Main cat : cats) {
            System.out.println(cat.toString());
        }
    }

}










