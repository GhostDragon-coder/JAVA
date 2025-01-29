import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Загадка: \"Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает\"");

        int attempts = 3;
        boolean usedHint = false;

        for (int i = 1; i <= attempts; i++) {
            System.out.print("Введите ответ >>> ");
            String answer = in.nextLine();

            // Проверка на подсказку
            if (answer.equalsIgnoreCase("Подсказка")) {
                if (i == 1 && !usedHint) {
                    System.out.println("Подсказка: Это вредоносное ПО в сжатом виде.");
                    usedHint = true;
                    attempts = 1;
                    i = 0;
                } else {
                    System.out.println("Подсказка уже недоступна.");
                }
                continue;
            }

            // Проверка ответа
            if (answer.equalsIgnoreCase("Заархивированный вирус")) {
                System.out.println("Правильно!");
                break;
            } else {
                if (i < attempts) {
                    System.out.println("Подумай еще!");
                } else {
                    System.out.println("Обидно, приходи в другой раз.");
                }
            }
        }
    }
}