import java.util.Scanner;
import org.jetbrains.annotations.NotNull;

public class Main16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Количество строк: ");
        int n = in.nextInt();
        in.nextLine();

        String[] lines = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Строка %d: ", i + 1);
            lines[i] = in.nextLine();
        }

        String result = findMaxUniqueCharsString(lines);
        System.out.println("Ответ: " + result);

        in.close();
    }

    @NotNull
    private static String findMaxUniqueCharsString(@NotNull String[] lines) {
        String maxStr = "";
        int maxCount = 0;

        for (String line : lines) {
            StringBuilder uniqueChars = new StringBuilder();

            for (char c : line.toCharArray()) {
                if (uniqueChars.indexOf(String.valueOf(c)) == -1) {
                    uniqueChars.append(c);
                }
            }

            if (uniqueChars.length() > maxCount) {
                maxCount = uniqueChars.length();
                maxStr = line;
            }
        }

        return maxStr;
    }
}