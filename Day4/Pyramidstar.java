import java.util.Scanner;
public class Pyramidstar {

    public static void main(String[] args) {
        System.out.println(" Enter the num of rows you want ");
        Scanner rs = new Scanner(System.in);
        int re = rs.nextInt();
        int rows = re, k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
            }

            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}