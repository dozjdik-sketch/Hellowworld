public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        // Задача 2: увеличиваем на 4
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println("Вывод для задачи 2:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 3: уменьшаем
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println("Вывод для задачи 3:");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        // Задача 4
        var friend = 19;
        System.out.println("Задача 4, начальное friend:");
        System.out.println(friend);

        friend = friend + 2;
        System.out.println("Задача 4, после +2:");
        System.out.println(friend);

        friend = friend / 7;
        System.out.println("Задача 4, после /7:");
        System.out.println(friend);

        // Задача 5
        var frog = 3.5;
        System.out.println("Задача 5, начальное frog:");
        System.out.println(frog);

        frog = frog * 10;
        System.out.println("Задача 5, после *10:");
        System.out.println(frog);

        frog = frog / 3.5;
        System.out.println("Задача 5, после /3.5:");
        System.out.println(frog);

        frog = frog + 4;
        System.out.println("Задача 5, после +4:");
        System.out.println(frog);

        // Задача 6
        var boxer1 = 78.2;
        var boxer2 = 82.7;

        var totalWeight = boxer1 + boxer2;
        var diffWeight = boxer2 - boxer1; // или Math.abs(boxer2 - boxer1)

        System.out.println("Задача 6, общая масса:");
        System.out.println(totalWeight);

        System.out.println("Задача 6, разница масс:");
        System.out.println(diffWeight);

        // Задача 7
        var remainder = boxer2 % boxer1;

        System.out.println("Задача 7, остаток от деления:");
        System.out.println(remainder);

        // Задача 8
        var totalHours = 640;
        var hoursPerEmployee = 8;

        var employees = totalHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + employees + " человек");

        var moreEmployees = employees + 94;
        var totalHoursForMore = moreEmployees * hoursPerEmployee;

        System.out.println("Если в компании работает " + moreEmployees + " человек, то всего "
                + totalHoursForMore + " часов работы может быть поделено между сотрудниками");
    }
}