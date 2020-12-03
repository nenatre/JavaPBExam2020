import java.util.Scanner;

public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int beginInt = Integer.parseInt(scanner.nextLine());
        int endInt = Integer.parseInt(scanner.nextLine());
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        boolean weFounded = false;
        for (int i = beginInt; i <= endInt; i++) {
            for (int j = beginInt; j <= endInt; j++) {
                counter++;
                if (i + j == magicNumber) {
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", counter, i, j, magicNumber);
                    weFounded = true;
                    break;
                }
            }
            if (weFounded) {
                break;
            }
        }
        if (!weFounded){
            System.out.printf("%d combinations - neither equals %d", counter, magicNumber);
        }
    }
}
