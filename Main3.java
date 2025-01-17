import java.util.Scanner;

public class Main3 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Задайте значение переменной x: ");
        int x = in.nextInt();
        System.out.print("Задайте значение переменной y: ");
        int y = in.nextInt();
        System.out.print("Задайте значение переменной z: ");
        int z = in.nextInt();

        int arithmetic_mean = (x + y + z) / 3;
        System.out.println("Среднее арифметическое = " + arithmetic_mean);

        arithmetic_mean /= 2;

        if (arithmetic_mean > 3)
            System.out.print("Программа выполнена корректно");

        in.close();
    }
}