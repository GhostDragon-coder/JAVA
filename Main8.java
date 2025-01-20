import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {

        double total = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        double [] myList = new double[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            myList[i] = in.nextDouble();
            total += myList[i];
        }

        double mean = total / size;
        for (double n : myList) {
            System.out.println(n + " * " + mean + " = " + (n * mean));
        }

        in.close();
    }
}