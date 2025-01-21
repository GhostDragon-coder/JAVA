import java.util.Random;

public class Main13 {
    public static void main(String[] args) {

        Random random = new Random();
        int[] myList = new int[15];

        for (int i = 0; i < myList.length; i++) {
            myList[i] = random.nextInt(41) - 20;;
        }

        int max = myList[0];
        int min = myList[0];

        for (int num : myList) {
            if (max < num) max = num;
            if (min > num) min = num;
        }

        System.out.println("\nМаксимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);

        int maxAbs = Math.max(Math.abs(max), Math.abs(min));
        System.out.println("Наибольшее по модулю значение: " + maxAbs);
    }
}