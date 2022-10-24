package taskhome.taskhome3;

import java.util.Scanner;

public class Rainbow {
    public static final String RED = "red";
    public static final String ORANGE = "orange";
    public static final String YELLOW = "yellow";
    public static final String GREEN = "green";
    public static final String BLUE = "blue";

    public static final String INDIGO = "indigo";

    public static final String VIOLET = "violet";

    public static String nameColor(int numberOfColor) {
        switch (numberOfColor) {
            case 1:
                return RED;
            case 2:
                return ORANGE;
            case 3:
                return YELLOW;
            case 4:
                return GREEN;
            case 5:
                return BLUE;
            case 6:
                return INDIGO;
            case 7:
                return VIOLET;
            default:
                return "color not found";
        }
    }

    public void getColor() {
        System.out.println("Enter the number: Primary colors -1 or Semi colors - 2  :");
        int color = new Scanner(System.in).nextInt();
        if (color == 1) {
            getPrimaryColor();
        } else if (color == 2) {
            getSemiColors();
        } else {
            printIncorrectMessage();
            

        }
    }

    public static void getPrimaryColor() {
        System.out.println("Enter the number of colour from 1 to 7:");
        int firstColor = new Scanner(System.in).nextInt();
        if (firstColor > 0 && firstColor < 8) {
            System.out.println("Your color is " + nameColor(firstColor));
        } else {
            printIncorrectMessage();
        }
    }

    public static void getSemiColors() {
        System.out.println("Enter the first number of color from 1 to 7:");
        int firstColor = new Scanner(System.in).nextInt();
        if (firstColor > 0 && firstColor < 8) {
            System.out.println("Enter the second number of color from 1 to 7 :");
            int secondColor = new Scanner(System.in).nextInt();
            if (secondColor > 0 && secondColor < 8 && secondColor != firstColor) {
                System.out.println("Your colour is " + nameColor(firstColor) + "-" + nameColor(secondColor));
            } else {
                printIncorrectMessage();
            }
        } else {
            printIncorrectMessage();
        }
    }

    public static void printIncorrectMessage() {
        System.out.println("Error");
    }
}
