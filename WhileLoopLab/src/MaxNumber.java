import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int max = Integer.MIN_VALUE;
        while (!number.equals("Stop")){
            int input = Integer.parseInt(number);
            if (input>max){
                max=input;
            }
            number = scanner.nextLine();
        }
        System.out.println(max);
    }
}
