import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите кол-во строк в матрице: ");
        int line = in.nextInt();
        System.out.print("Введите кол-во колнок в матрице: ");
        int column = in.nextInt();

        int [][] myList = new int[line][column];

        for (int iLine = 0; iLine < line; iLine++) {
            System.out.println("Задайте значение ячеек строки №" + (iLine + 1) + ": ");
            for (int iColumn = 0; iColumn < column; iColumn++){
                System.out.print("    Ячейка №" + (iColumn + 1) + ": ");
                myList[iLine][iColumn] = in.nextInt();
            }
        }

        System.out.println("Первая строка матрицы, значения умноженны на 3:");
        for (int iColumn : myList[0]){
            System.out.print(iColumn * 3 + " ");
        }

        in.close();
    }
}