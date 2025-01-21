import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        String a = in.nextLine();

        System.out.print("Введите второе число: ");
        int b = in.nextInt();

        int max = Math.max(Integer.parseInt(a), b);
        System.out.println("Большее число: " + max);

        double min = (max == b) ? Double.parseDouble(a) : (double) b;
        System.out.println("Меньшее число: " + min);

        in.close();

    }
}