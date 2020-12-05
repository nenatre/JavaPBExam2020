import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number = scanner.nextLine();
        int min = Integer.MAX_VALUE;
        while(!number.equals("Stop")){
            int input = Integer.parseInt(number);
            if (input<min){
                min=input;
            }
            number=scanner.nextLine();
        }
        System.out.println(min);
    }
}
