import java.util.Scanner;
public class Combinations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magicNumber = Integer.parseInt(scanner.nextLine());
        int count =0;
        for (int x1 = 0; x1 <= magicNumber; x1++) {
            for (int x2 = 0; x2 <= magicNumber; x2++) {
                for (int x3 = 0; x3 <=magicNumber ; x3++) {
                    if (x1 + x2+ x3 == magicNumber){
                        count++;
                    }
                }

            }
        }
        System.out.println(count);
    }
}
