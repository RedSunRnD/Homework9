import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Задача №1
        System.out.println();
        int[] expensesA = {114000, 2500, 39800, 0, 790};
        int sumA = 0;
        for (int i = 0; i < expensesA.length; i++) {
            sumA = sumA + expensesA[i];
        }
        System.out.println("Траты за месяц составили " + sumA + " рублей.");
        System.out.println();
        //Задача №2
        int[] expensesB = {11520, 2690, 657, 97871, 3654};
        int min = 1_000_000_000;
        int max = -1;
        for (int i = 0; i < expensesB.length; i++) {
            if (expensesB[i] > max) {
                max = expensesB[i];
            } else if (expensesB[i] < min) {
                min = expensesB[i];
            }
        }
        System.out.println("Максимальная сумма трат за неделю составила " + max + " рублей. Минимальная сумма трат за неделю составила " + min + " рублей.");
        System.out.println();
        //Задача №3
        int [] expensesC = {5694, 1236, 7895, 5555, 6618};
        int sumC = 0;
        for (int i = 0; i < expensesC.length; i++) {
            sumC = sumC + expensesC[i];
        }
        double middleValue = sumC / expensesC.length;
        System.out.println("Средняя сумма трат составила " + middleValue + " рублей.");
        System.out.println();
        //Задача №4
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}