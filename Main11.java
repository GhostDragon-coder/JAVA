import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String str = in.nextLine();

        if (str.contains("Java") && str.startsWith("I like") && str.endsWith("!!!")) {
            System.out.println(str.toUpperCase());
            System.out.println(str.replace('a', 'o').substring(7, 11));
        }

        in.close();

    }
}