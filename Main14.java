import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("- Курс доллара: ");
        double  dollarRate = in.nextDouble();

        System.out.print("- Количество рублей: ");
        int  rublesCount = in.nextInt();

        double result = rublesCount / dollarRate;
        System.out.printf("- Итого: %.2f долларов", result);

        in.close();

    }
}