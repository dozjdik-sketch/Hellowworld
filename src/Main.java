public class Main {
    public static void main(String[] args) {

        // Задача 1
        System.out.println("Задача 1:");

        int[] inputArray1 = new int[5];

        inputArray1[0] = 10000;
        inputArray1[1] = 25000;
        inputArray1[2] = 18000;
        inputArray1[3] = 32000;
        inputArray1[4] = 15000;

        float[] outputArray1 = new float[4];

        int sum = 0;
        int maximum = inputArray1[0];
        int minimum = inputArray1[0];

        for (int payment : inputArray1) {
            sum = sum + payment;

            if (payment > maximum) {
                maximum = payment;
            }

            if (payment < minimum) {
                minimum = payment;
            }
        }

        float average = (float) sum / inputArray1.length;

        outputArray1[0] = sum;
        outputArray1[1] = maximum;
        outputArray1[2] = minimum;
        outputArray1[3] = average;

        System.out.println("inputArray1:");

        for (int element : inputArray1) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("outputArray1:");

        for (float element : outputArray1) {
            System.out.print(element + " ");
        }

        System.out.println();


        // Задача 2
        System.out.println("\nЗадача 2:");

        int[] inputArray2 = new int[5];

        inputArray2[0] = 30000;
        inputArray2[1] = 45000;
        inputArray2[2] = 52000;
        inputArray2[3] = 28000;
        inputArray2[4] = 60000;

        float[] outputArray2 = new float[inputArray2.length];

        int index = 0;

        for (int salary : inputArray2) {
            outputArray2[index] = salary * 0.13f;
            index = index + 1;
        }

        System.out.println("inputArray2:");

        for (int element : inputArray2) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("outputArray2:");

        for (float element : outputArray2) {
            System.out.print(element + " ");
        }

        System.out.println();


        // Задача 3
        System.out.println("\nЗадача 3:");

        int[] inputArray3 = new int[5];

        inputArray3[0] = 3500;
        inputArray3[1] = 7500;
        inputArray3[2] = 4200;
        inputArray3[3] = 10000;
        inputArray3[4] = 5000;

        boolean[] outputArray3 = new boolean[inputArray3.length];

        index = 0;

        for (int bonus : inputArray3) {
            outputArray3[index] = bonus > 5000;
            index = index + 1;
        }

        System.out.println("inputArray3:");

        for (int element : inputArray3) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("outputArray3:");

        for (boolean element : outputArray3) {
            System.out.print(element + " ");
        }

        System.out.println();


        // Задача 4
        System.out.println("\nЗадача 4:");

        int[] inputArray4 = new int[5];

        inputArray4[0] = 15000;
        inputArray4[1] = 12000;
        inputArray4[2] = 8000;
        inputArray4[3] = 5000;
        inputArray4[4] = 3000;

        boolean[] outputArray4 = new boolean[1];

        outputArray4[0] = true;

        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4[0] = false;
                break;
            }
        }

        System.out.println("inputArray4:");

        for (int element : inputArray4) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("outputArray4:");

        for (boolean element : outputArray4) {
            System.out.print(element + " ");
        }

        System.out.println();


        // Задача 5
        System.out.println("\nЗадача 5:");

        int[] inputArray5 = new int[5];

        inputArray5[0] = 150000;
        inputArray5[1] = -20000;
        inputArray5[2] = 75000;
        inputArray5[3] = 0;
        inputArray5[4] = 120000;

        int[] outputArray5 = new int[1];

        int profitableMonths = 0;

        for (int profit : inputArray5) {
            if (profit > 0) {
                profitableMonths = profitableMonths + 1;
            }
        }

        outputArray5[0] = profitableMonths;

        System.out.println("inputArray5:");

        for (int element : inputArray5) {
            System.out.print(element + " ");
        }

        System.out.println();

        System.out.println("outputArray5:");

        for (int element : outputArray5) {
            System.out.print(element + " ");
        }

        System.out.println();
    }
}