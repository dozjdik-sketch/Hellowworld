public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1:");

        int firstFriday = 4;

        for (int day = 1; day <= 31; day = day + 1) {
            if (day >= firstFriday && (day - firstFriday) % 7 == 0) {
                System.out.println(
                        "Сегодня пятница, " + day + "-е число. Необходимо подготовить отчет"
                );
            }
        }


        // Задание 2
        System.out.println("\nЗадание 2:");

        int distance = 0;

        do {
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров");
            distance = distance + 500;
        } while (distance <= 42195);

        System.out.println("\nВторая версия с циклом for:");

        for (int distanceFor = 0;
             distanceFor <= 42195;
             distanceFor = distanceFor + 500) {

            System.out.println(
                    "Держитесь! Осталось " + (42195 - distanceFor) + " метров"
            );
        }


        // Задание 3
        System.out.println("\nЗадание 3:");

        int budget = 1000;
        int day = 1;
        int daysWithWhile = 0;

        while (budget > 0) {
            if (day % 5 == 0) {
                daysWithWhile = day;
                day = day + 1;
                continue;
            }

            budget = budget - 100;
            daysWithWhile = day;
            day = day + 1;
        }

        System.out.println("С использованием while бюджет закончится на "
                + daysWithWhile + "-й день.");

        int budgetFor = 1000;
        int daysWithFor = 0;

        for (int dayFor = 1; budgetFor > 0; dayFor = dayFor + 1) {
            if (dayFor % 5 == 0) {
                daysWithFor = dayFor;
                continue;
            }

            budgetFor = budgetFor - 100;
            daysWithFor = dayFor;
        }

        System.out.println("С использованием for бюджет закончится на "
                + daysWithFor + "-й день.");


        // Задание 4
        System.out.println("\nЗадание 4:");

        int month = 0;
        int total = 0;

        while (true) {
            month = month + 1;
            total = total + 15000;

            if (month % 6 == 0) {
                total = total + total * 7 / 100;
            }

            System.out.println(
                    "Месяц " + month + ", сумма накоплений равна " + total + " рублей"
            );

            if (total >= 12000000) {
                break;
            }
        }

        System.out.println("Всего месяцев понадобится: " + month);


        // Задание 5
        System.out.println("\nЗадание 5:");

        int charge = 20;
        int minute = 0;
        int overheats = 0;

        while (charge < 100 && overheats < 3) {
            minute = minute + 1;

            if (minute % 10 == 0) {
                overheats = overheats + 1;

                System.out.println(
                        "Перегрев №" + overheats
                                + ". Зарядка прервана на 2 минуты."
                );

                minute = minute + 2;

                if (overheats == 3) {
                    System.out.println(
                            "Зарядка прекращена. Текущий заряд: " + charge + "%"
                    );
                    break;
                }

                continue;
            }

            charge = charge + 2;

            if (charge > 100) {
                charge = 100;
            }
        }

        if (charge == 100) {
            System.out.println(
                    "Зарядка завершена. Текущий заряд: " + charge + "%"
            );
        }

        System.out.println("Время зарядки составило " + minute + " минут.");
    }
}