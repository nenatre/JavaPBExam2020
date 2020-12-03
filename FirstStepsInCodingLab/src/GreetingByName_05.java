import java.util.Scanner;

public class GreetingByName_05 {
    public static void main(String[] args) {

            Scanner scan = new Scanner (System.in);
//        System.out.println ("Please type your name:");
        String name = scan.nextLine();
        System.out.printf("Hello, %s!", name);



    }
}
