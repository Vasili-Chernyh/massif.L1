import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }
    public static void task1 () {
        System.out.println("Задача 1");
        int [] numbers1 = new int[12];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 0; i < numbers1.length; i++) {
            System.out.println(numbers1[i]);
        }
        double [] numbers2 = {1.57, 7.654, 9.986,0,3,6,32,845,34.6};
        for (int i = 0; i < numbers2.length; i++) {
            System.out.println(numbers2[i]);
        }
        int [] numbers3 = new int[9];
        for (int i = 0; i < 9; i++){
            numbers3 [i] = i;
            System.out.println(numbers3[i]);
        }
    }

    public static void task2 () {
        System.out.println("Задача 2");
        int [] numbers1 = new int[12];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 0; i < numbers1.length; i++) {
            if (i < numbers1.length - 1) {
                System.out.print(numbers1[i] + ",");
            }
            else System.out.println(numbers1[i]);
        }
        double [] numbers2 = {1.57, 7.654, 9.986,0,3,6,32,845,34.6};
        for (int i = 0; i < numbers2.length; i++) {
            if (i < numbers2.length - 1) {
                System.out.print(numbers2[i] + ",");
            }
            else System.out.println(numbers2[i]);
        }
        int [] numbers3 = new int[9];
        for (int i = 0; i < 9; i++){
            numbers3 [i] = i;
            if (i < numbers3.length - 1) {
                System.out.print(numbers3[i] + ",");
            }
            else System.out.println(numbers3[i]);
        }
    }
    public static void task3 () {
        System.out.println("Задача 3");
        int[] numbers1 = new int[12];
        numbers1[0] = 1;
        numbers1[1] = 2;
        numbers1[2] = 3;
        for (int i = 11; i > -1; i--) {
            if (i > 0) {
                System.out.print(numbers1[i] + ",");
            }
            else System.out.println(numbers1[i]);
        }
        double [] numbers2 = {1.57, 7.654, 9.986,0,3,6,32,845,34.6};
        for (int i = numbers2.length - 1; i > -1 ; i--) {
            if (i > 0) {
                System.out.print(numbers2[i] + ",");
            }
            else System.out.println(numbers2[i]);
        }
        int [] numbers3 = new int[9];
        for (int i = numbers3.length - 1; i > -1; i--){
            numbers3 [i] = i;
            if (i > 0) {
                System.out.print(numbers3[i] + ",");
            }
            else System.out.println(numbers3[i]);
        }
    }
    public static void task4 () {
        System.out.println("Задача 4");
        int [] numbers3 = new int[15];
        for (int i = 0; i < 15; i++){
            numbers3 [i] = i;
            if (numbers3 [i] % 2 != 0){
                numbers3[i] = i+1;
            }
        }
        System.out.println(Arrays.toString (numbers3));
    }
}