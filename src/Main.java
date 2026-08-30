public class Main {
    public static void main(String[] args) {

        // Задача 1
        int clientOS = 1;

        System.out.println("\nЗадача 1:");
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 2
        int clientDeviceYear = 2014;

        System.out.println("\nЗадача 2:");
        if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        // Задача 3
        int year = 2021;

        System.out.println("\nЗадача 3:");
        if (year > 1584 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Задача 4
        int deliveryDistance = 95;
        int deliveryDays = 1;

        System.out.println("\nЗадача 4:");
        if (deliveryDistance > 100) {
            System.out.println("Потребуется дней: " + deliveryDays);
        } else {
            if (deliveryDistance > 60) {
                deliveryDays++;
            }
            if (deliveryDistance > 20) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней: " + deliveryDays);
        }

        // Задача 5
        int monthNumber = 9;

        System.out.println("\nЗадача 5:");
        if (monthNumber < 1 || monthNumber > 12) {
            System.out.println("Неверный номер месяца");
        } else {
            switch (monthNumber) {
                case 12:
                case 1:
                case 2:
                    System.out.println("Месяц принадлежит к сезону зима");
                    break;
                case 3:
                case 4:
                case 5:
                    System.out.println("Месяц принадлежит к сезону весна");
                    break;
                case 6:
                case 7:
                case 8:
                    System.out.println("Месяц принадлежит к сезону лето");
                    break;
                case 9:
                case 10:
                case 11:
                    System.out.println("Месяц принадлежит к сезону осень");
                    break;
                default:
                    System.out.println("Неверный номер месяца");
                    break;
            }
        }
    }
}