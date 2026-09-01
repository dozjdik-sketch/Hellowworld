public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1:");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println(i);
        }

        // Задача 2
        System.out.println("\nЗадача 2:");
        for (int i = 10; i >= 1; i = i - 1) {
            System.out.println(i);
        }

        // Задача 3
        System.out.println("\nЗадача 3:");
        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }

        // Задача 4
        System.out.println("\nЗадача 4:");
        for (int i = 10; i >= -10; i = i - 1) {
            System.out.println(i);
        }

        // Задача 5
        System.out.println("\nЗадача 5:");
        for (int year = 1904; year <= 2096; year = year + 4) {
            System.out.println(year + " год является високосным");
        }

        // Задача 6
        System.out.println("\nЗадача 6:");
        for (int i = 7; i <= 98; i = i + 7) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 7
        System.out.println("\nЗадача 7:");
        for (int i = 1; i <= 512; i = i * 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Задача 8
        System.out.println("\nЗадача 8:");
        int savings = 0;
        for (int month = 1; month <= 12; month = month + 1) {
            savings = savings + 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + savings + " рублей");
        }

        // Задача 9
        System.out.println("\nЗадача 9:");
        int bankSavings = 0;
        for (int month = 1; month <= 12; month = month + 1) {
            bankSavings = bankSavings + bankSavings / 100;
            bankSavings = bankSavings + 29000;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + bankSavings + " рублей");
        }

        // Задача 10
        System.out.println("\nЗадача 10:");
        for (int i = 1; i <= 10; i = i + 1) {
            System.out.println("2*" + i + "=" + (2 * i));
        }
    }
}