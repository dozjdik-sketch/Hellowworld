public class Main {
    public static void main(String[] args) {

        // Задача 1
        int intNumber = 100;
        byte byteNumber = 10;
        short shortNumber = 1000;
        long longNumber = 9876543210L;
        float floatNumber = 27.12f;
        double doubleNumber = 2.786;

        System.out.println("\nЗадача 1:");
        System.out.println("Значение переменной intNumber с типом int равно " + intNumber);
        System.out.println("Значение переменной byteNumber с типом byte равно " + byteNumber);
        System.out.println("Значение переменной shortNumber с типом short равно " + shortNumber);
        System.out.println("Значение переменной longNumber с типом long равно " + longNumber);
        System.out.println("Значение переменной floatNumber с типом float равно " + floatNumber);
        System.out.println("Значение переменной doubleNumber с типом double равно " + doubleNumber);

        // Задача 2
        double value1 = 27.12;
        long value2 = 987678965549L;
        float value3 = 2.786f;
        int value4 = 569;
        int value5 = -159;
        int value6 = 27897;
        byte value7 = 67;

        System.out.println("\nЗадача 2:");
        System.out.println(value1);
        System.out.println(value2);
        System.out.println(value3);
        System.out.println(value4);
        System.out.println(value5);
        System.out.println(value6);
        System.out.println(value7);

        // Задача 3
        int studentsInFirstClass = 23;
        int studentsInSecondClass = 27;
        int studentsInThirdClass = 30;
        int totalPaper = 480;

        int totalStudents = studentsInFirstClass
                + studentsInSecondClass
                + studentsInThirdClass;

        int paperPerStudent = totalPaper / totalStudents;

        System.out.println("\nЗадача 3:");
        System.out.println("На каждого ученика рассчитано "
                + paperPerStudent + " листов бумаги");

        // Задача 4
        int bottlesPerTwoMinutes = 16;
        int minutesInTwoMinutes = 2;
        int bottlesPerMinute = bottlesPerTwoMinutes / minutesInTwoMinutes;

        int bottlesInTwentyMinutes = bottlesPerMinute * 20;
        int bottlesInDay = bottlesPerMinute * 60 * 24;
        int bottlesInThreeDays = bottlesInDay * 3;
        int bottlesInMonth = bottlesInDay * 30;

        System.out.println("\nЗадача 4:");
        System.out.println("За 20 минут машина произвела "
                + bottlesInTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела "
                + bottlesInDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела "
                + bottlesInThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела "
                + bottlesInMonth + " штук бутылок");

        // Задача 5
        int totalPaintCans = 120;
        int whitePaintPerClass = 2;
        int brownPaintPerClass = 4;
        int paintPerClass = whitePaintPerClass + brownPaintPerClass;

        int numberOfClasses = totalPaintCans / paintPerClass;
        int totalWhitePaint = numberOfClasses * whitePaintPerClass;
        int totalBrownPaint = numberOfClasses * brownPaintPerClass;

        System.out.println("\nЗадача 5:");
        System.out.println("В школе, где " + numberOfClasses
                + " классов, нужно " + totalWhitePaint
                + " банок белой краски и " + totalBrownPaint
                + " банок коричневой краски");

        // Задача 6
        int bananas = 5;
        int gramsPerBanana = 80;

        int milkMilliliters = 200;
        int gramsPer100MillilitersMilk = 105;
        int milkWeight = milkMilliliters / 100 * gramsPer100MillilitersMilk;

        int iceCreamBricks = 2;
        int gramsPerIceCreamBrick = 100;

        int eggs = 4;
        int gramsPerEgg = 70;

        int breakfastWeightInGrams =
                bananas * gramsPerBanana
                        + milkWeight
                        + iceCreamBricks * gramsPerIceCreamBrick
                        + eggs * gramsPerEgg;

        double breakfastWeightInKilograms =
                breakfastWeightInGrams / 1000.0;

        System.out.println("\nЗадача 6:");
        System.out.println("Вес спортзавтрака: "
                + breakfastWeightInGrams + " грамм");
        System.out.println("Вес спортзавтрака: "
                + breakfastWeightInKilograms + " килограмма");

        // Задача 7
        int weightToLoseInKilograms = 7;
        int weightToLoseInGrams = weightToLoseInKilograms * 1000;

        int minimumLossPerDay = 250;
        int maximumLossPerDay = 500;

        int daysAt250Grams = weightToLoseInGrams / minimumLossPerDay;
        int daysAt500Grams = weightToLoseInGrams / maximumLossPerDay;

        double averageLossPerDay =
                (minimumLossPerDay + maximumLossPerDay) / 2.0;

        double averageDays =
                weightToLoseInGrams / averageLossPerDay;

        System.out.println("\nЗадача 7:");
        System.out.println("Если спортсмен теряет по 250 грамм в день, "
                + "ему потребуется " + daysAt250Grams + " дней");
        System.out.println("Если спортсмен теряет по 500 грамм в день, "
                + "ему потребуется " + daysAt500Grams + " дней");
        System.out.printf("В среднем потребуется примерно %.1f дней%n",
                averageDays);

        // Задача 8
        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryKristina = 76230;

        double salaryMashaAfterRaise = salaryMasha * 1.10;
        double salaryDenisAfterRaise = salaryDenis * 1.10;
        double salaryKristinaAfterRaise = salaryKristina * 1.10;

        double annualDifferenceMasha =
                (salaryMashaAfterRaise - salaryMasha) * 12;
        double annualDifferenceDenis =
                (salaryDenisAfterRaise - salaryDenis) * 12;
        double annualDifferenceKristina =
                (salaryKristinaAfterRaise - salaryKristina) * 12;

        System.out.println("\nЗадача 8:");
        System.out.printf(
                "Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",
                salaryMashaAfterRaise,
                annualDifferenceMasha
        );

        System.out.printf(
                "Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",
                salaryDenisAfterRaise,
                annualDifferenceDenis
        );

        System.out.printf(
                "Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей%n",
                salaryKristinaAfterRaise,
                annualDifferenceKristina
        );
    }
}