import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Выберите что переводить: 1 - масса, 2 - расстояние\n>>> ");
        int x = in.nextInt();

        if (x == 1) {
            System.out.print("Выберите единицу измерения: 1 - килограмм, 2 - центнер, 3 - стоун, 4 - фунт\n>>> ");
            int y = in.nextInt();
            System.out.print("Введите число\n>>> ");
            double z = in.nextDouble();

            switch (y) {
                case 1:
                    System.out.println("Килограмм: " + z);
                    System.out.println("Центнер: " + (z / 100));
                    System.out.println("Стоун: " + (z / 6.35));
                    System.out.println("Фунт: " + (z / 0.4536));
                    break;
                case 2:
                    System.out.println("Центнер: " + z);
                    System.out.println("Килограмм: " + (z * 100));
                    System.out.println("Стоун: " + (z * 100 / 6.35));
                    System.out.println("Фунт: " + (z * 100 / 0.4536));
                    break;
                case 3:
                    System.out.println("Стоун: " + z);
                    System.out.println("Килограмм: " + (z * 6.35));
                    System.out.println("Центнер: " + (z * 6.35 / 100));
                    System.out.println("Фунт: " + (z * 6.35 / 0.4536));
                    break;
                case 4:
                    System.out.println("Фунт: " + z);
                    System.out.println("Килограмм: " + (z * 0.4536));
                    System.out.println("Центнер: " + (z * 0.4536 / 100));
                    System.out.println("Стоун: " + (z * 0.4536 / 6.35));
                    break;
                default:
                    System.out.println("Ошибка ввода!");
                    break;
            }
        } else if (x == 2) {
            System.out.print("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут\n>>> ");
            int y = in.nextInt();
            System.out.print("Введите число\n>>> ");
            double z = in.nextDouble();

            switch (y) {
                case 1:
                    System.out.println("Метры: " + z);
                    System.out.println("Мили: " + (z / 1609.34));
                    System.out.println("Ярды: " + (z * 1.09361));
                    System.out.println("Футы: " + (z * 3.28084));
                    break;
                case 2:
                    System.out.println("Мили: " + z);
                    System.out.println("Метры: " + (z * 1609.34));
                    System.out.println("Ярды: " + (z * 1760));
                    System.out.println("Футы: " + (z * 5280));
                    break;
                case 3:
                    System.out.println("Ярды: " + z);
                    System.out.println("Метры: " + (z / 1.09361));
                    System.out.println("Мили: " + (z / 1760));
                    System.out.println("Футы: " + (z * 3));
                    break;
                case 4:
                    System.out.println("Футы: " + z);
                    System.out.println("Метры: " + (z / 3.28084));
                    System.out.println("Мили: " + (z / 5280));
                    System.out.println("Ярды: " + (z / 3));
                    break;
                default:
                    System.out.println("Ошибка ввода!");
                    break;
            }
        } else {
            System.out.println("Ошибка ввода!");
        }
        in.close();
    }
}