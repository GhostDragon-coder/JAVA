import java.util.Scanner;

public class Main4 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Задайте значение переменной x: ");
        int x = in.nextInt();
        System.out.print("Задайте значение переменной y: ");
        int y = in.nextInt();
        System.out.print("Введите один из символов ‘+’, ‘-’, ‘*’ или ‘/’: ");
        String operation = in.next();
        in.close();

        switch (operation) {
            case "+":
                System.out.println("Ответ: " + (x + y));
                break;
            case "-":
                System.out.println("Ответ: " + (x - y));
                break;
            case "*":
                System.out.println("Ответ: " + (x * y));
                break;
            case "/":
                if (y != 0) {
                    System.out.println("Ответ: " + (x / y));
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                }
                break;
            default:
                System.out.println("Ошибка ввода!");
                break;
        }
    }
}
