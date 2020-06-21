import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String words = scanner.nextLine();
        String word = scanner.nextLine();
        int count = 1;
        
        if (words.indexOf(word) != -1) {
            for (int i = 0; i < words.indexOf(word); i++) {
                if (words.charAt(i) == ' ') {
                    count++;
                }
            }
            System.out.println(count);
        } else {
            System.out.println("Not found");
        }

    }
}
