import java.util.Scanner;

public class Main15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.print("- Ввод: ");
            String equationStr = in.nextLine();

            if (equationStr.equals("break")) {
                break;
            }

            if (equationStr.length() != 5 || (equationStr.charAt(1) != '+' && equationStr.charAt(1) != '-') || equationStr.charAt(3) != '=') {
                System.out.println("ОШИБКА ВВОДА!");
                continue;
            }

            int result = 0;

            switch (equationStr.charAt(1)) {
                case '+':
                    if (equationStr.startsWith("x")) {
                        result = Character.getNumericValue(equationStr.charAt(4)) - Character.getNumericValue(equationStr.charAt(2));
                    } else if (equationStr.endsWith("x")) {
                        result = Character.getNumericValue(equationStr.charAt(0)) + Character.getNumericValue(equationStr.charAt(2));
                    } else if (equationStr.charAt(2) == 'x') {
                        result = Character.getNumericValue(equationStr.charAt(4)) - Character.getNumericValue(equationStr.charAt(0));
                    }
                    break;
                case '-':
                    if (equationStr.startsWith("x")) {
                        result = Character.getNumericValue(equationStr.charAt(4)) + Character.getNumericValue(equationStr.charAt(2));
                    } else if (equationStr.endsWith("x")) {
                        result = Character.getNumericValue(equationStr.charAt(0)) - Character.getNumericValue(equationStr.charAt(2));
                    } else if (equationStr.charAt(2) == 'x') {
                        result = Character.getNumericValue(equationStr.charAt(0)) - Character.getNumericValue(equationStr.charAt(4));
                    }
                    break;
            }

            System.out.println("- Вывод: " + result);
        }

        in.close();
    }
}