public class Main {
    public static void main(String[] args) {

        // Задача 1
        int age = 13;

        System.out.println("\nЗадача 1:");
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        int temperature = 14;

        System.out.println("\nЗадача 2:");
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3
        int speed = 61;

        System.out.println("\nЗадача 3:");
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // Задача 4
        int personAge = 25;

        System.out.println("\nЗадача 4:");
        if (personAge >= 2 && personAge <= 6) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в детский сад");
        } else if (personAge >= 7 && personAge <= 17) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в школу");
        } else if (personAge >= 18 && personAge <= 24) {
            System.out.println("Если возраст человека равен " + personAge + ", то ему нужно ходить в университет");
        } else {
            System.out.println("Если возраст человека равен " + personAge + ", то ему пора ходить на работу");
        }

        // Задача 5
        int childAge = 14;
        boolean hasAdult = true;

        System.out.println("\nЗадача 5:");
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge <= 14) {
            if (hasAdult) {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
            } else {
                System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе без взрослого");
            }
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6
        int peopleInTrain = 90;
        int trainCapacity = 102;
        int sittingSeats = 60;

        System.out.println("\nЗадача 6:");
        if (peopleInTrain >= trainCapacity) {
            System.out.println("В вагоне уже полностью забито");
        } else if (peopleInTrain < sittingSeats) {
            System.out.println("В вагоне есть сидячее место");
        } else {
            System.out.println("В вагоне есть стоячее место");
        }

        // Задача 7
        int one = 7;
        int two = 12;
        int three = 9;

        System.out.println("\nЗадача 7:");
        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= one && two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}