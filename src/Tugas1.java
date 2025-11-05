import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("N = ");
        int input = sc.nextInt();

        for (int i = 0; i != input; i++) {

            for (int x = 0; x != input; x++) {

                if (i == 0 || i == (input - 1) || x == 0 || x == (input - 1)) {
                    System.out.print(input);
                } else System.out.print(" ".repeat(String.valueOf(input).length()));

            }

            System.out.println();
        }
    }
}
