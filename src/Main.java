import java.util.Arrays; public class Main {
    public static void main(String[] args) {
        task1();


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }

        return arr;


    }
    public static void task1() {
        int[] arr = generateRandomArray();
        System.out.println(Arrays.toString(arr));
           int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            summ = summ + arr[i];

            }
        System.out.println("Сумма трат за месяц составила " + summ + " рублей.");
//task 2
        int maxSumm = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxSumm) {
                maxSumm = arr[i];

            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxSumm + " рублей.");

        int minSumm = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < minSumm) {
                minSumm = arr[i];

            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minSumm + " рублей.");

        // task 3
        double summ2 = 0.00;
        for (double i = 0.00; i < arr.length; i++) {
            summ2 = summ2 + (double) arr[(int) i] / 30;

        }
        System.out.println("Средняя сумма трат за месяц составила " + summ2 + " рублей.");

// task 4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i > -1; i--) {
            System.out.print(reverseFullName[i]);
        }


        }
        }
