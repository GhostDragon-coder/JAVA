import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {

        int x = 3;
        int y = 6;
        int z = 9;
        int i = 0;

        Scanner in = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int size = in.nextInt();

        int[] myList = new int[size];

        while (i < size) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            int num = in.nextInt();
            if (num == x | num == y | num == z) {
                System.out.print("Данное значение имеется в константах\n");
                continue;
            }
            myList[i] = num;
            i++;
        }

        System.out.print("\nВведённый массив: ");
        for (int num : myList) {
            System.out.print(num + " ");
        }

        in.close();
    }
}