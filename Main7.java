import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        int total = 0;

        System.out.print("Введите число: ");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        for (int i = 1; i < num; i += 2) {
            total += i;
        }

        System.out.println("Сумма всех нечётных чисел от 1 до " + num + " = " + total);

        in.close();
    }
}