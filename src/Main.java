//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {

        System.out.println("// Task 1");

        int[] houses = new int[] {1, 2, 3};
        for (int i = 0; i < houses.length; i++) {
            System.out.print(houses[i]);
            if (i < houses.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        double[] numbers = {1.57, 7.654, 9.986};
        for (int i = 0; i <numbers.length; i++) {
            System.out.print(numbers[i]);
            if (i < numbers.length -1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        int [] ages = new int [5];
        ages[0] = 21;
        ages[1] = 25;
        ages[2] = 30;
        ages[3] = 18;
        ages[4] = 40;
        for (int age: ages) {
            System.out.print(age + " ");
        }
        System.out.println();

        System.out.println("// Task 2");

        int[] carNumbers = {1, 2, 3};
        double[] decimals = {1.57, 7.654, 9.986};
        String[] words = {"apple", "banana", "pear"};

        for (int i = 0; i < carNumbers.length; i++) {
            System.out.print(carNumbers[i]);
            if (i < carNumbers.length -1)System.out.print(", ");
        }
        System.out.println();

        for (int i = 0; i < decimals.length; i++) {
            System.out.print(decimals[i]);
            if (i < decimals.length -1) System.out.print(", ");
        }

        System.out.println();

        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i]);
            if (i < words.length -1) System.out.print(", ");
        }
        System.out.println();

        System.out.println("// Task 3");

        int[] houseNumbers = {1, 2, 3};
        double[] numberDecimals = {1.57, 7.654, 9.986};
        String[] fruits = {"apple", "banana", "pear"};

        for (int i = houseNumbers.length -1; i >= 0; i--) {
            System.out.print(houseNumbers[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        for (int i = numberDecimals.length -1; i >= 0; i--) {
            System.out.print(numberDecimals[i]);
            if (i > 0) System.out.print(", ");
        }
            System.out.println();

        for (int i = fruits.length -1; i >= 0; i--) {
            System.out.print(fruits[i]);
            if (i > 0) System.out.print(", ");
        }
        System.out.println();

        System.out.println("// Task 4");

        int[] digits = {1, 2, 3, 4, 5, 6};

        for (int i = 0; i < digits.length; i++){
            if (digits [i] % 2 !=0) {
                digits [i] += 1;
            }
        }

        System.out.println(Arrays.toString (digits));
    }
}