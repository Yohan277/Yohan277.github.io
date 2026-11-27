import java.util.Scanner;

public class TwoDim {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int arr[][] = new int[3][3];
        char choice;
    do {
        System.out.println("Input 9 elements (3x3): ");
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                arr[row][col] = scanner.nextInt();
            }
        }
        System.out.println("\n\t\tRow Sum");
        for (int row = 0; row < 3; row++) {
        int rowSum = 0;
            for (int col = 0; col < 3; col++) {
                System.out.printf("%5d", arr[row][col]);
                rowSum += arr[row][col];
            }
            System.out.printf("%10d\n", rowSum);
        }

        System.out.print("\nColumun sum");
        for (int col = 0; col < 3; col++) {
            int colSum = 0;
            for (int row = 0; row < 3; row++) {
                colSum += arr[row][col];
            }
            System.out.printf("%5d", colSum);
        }
        int diag1 = 0, diag2 = 0;
        for (int i = 0; i < 3; i++) {
            diag1 += arr[i][i];
            diag2 += arr[i][2 -i];
        }
        System.out.printf("\nDiagonal sum 1\t%d", diag1);
        System.out.printf("\nDiagonal sum 2\t%d\n", diag2);

        System.out.print("\nTry again? (y/n): ");
        choice = scanner.next().charAt(0);
        System.out.println();

    } while (choice == 'y' || choice == 'Y');

    scanner.close();
    }
}
