import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {

        String latin = "abcdefghijklmnopqrstuvwxyz";

        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String[] words = in.nextLine().split(" ");

        int counter = 0;
        for (String word : words) {
            boolean flag = true;
            for (char sym : word.toCharArray()) {
                if (!latin.contains(String.valueOf(sym).toLowerCase())) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.print(word + " ");
                counter++;
            }
        }

        System.out.println("\nКоличество слов, состоящих только из латинских букв: " + counter);

        in.close();

    }
}