import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        // Задача 1

        // Целочисленный массив, созданный с помощью new
        int[] numbers = new int[3];

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        // Массив дробных чисел, сразу заполненный значениями
        double[] decimalNumbers = {1.57, 7.654, 9.986};

        // Произвольный массив
        String[] words = {"Java", "массив", "обучение"};


        // Задача 2
        System.out.println("Задача 2:");

        for (int i = 0; i < numbers.length; i = i + 1) {
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < decimalNumbers.length; i = i + 1) {
            System.out.print(decimalNumbers[i]);

            if (i < decimalNumbers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < words.length; i = i + 1) {
            System.out.print(words[i]);

            if (i < words.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Задача 3
        System.out.println("\nЗадача 3:");

        for (int i = numbers.length - 1; i >= 0; i = i - 1) {
            System.out.print(numbers[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = decimalNumbers.length - 1; i >= 0; i = i - 1) {
            System.out.print(decimalNumbers[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = words.length - 1; i >= 0; i = i - 1) {
            System.out.print(words[i]);

            if (i > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        // Задача 4
        System.out.println("\nЗадача 4:");

        for (int i = 0; i < numbers.length; i = i + 1) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
        }

        System.out.println(Arrays.toString(numbers));
    }
}