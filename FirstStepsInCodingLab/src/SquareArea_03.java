import java.util.Scanner;

public class SquareArea_03 {
    public static void main(String[] args) { ;
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter one number and than press ENTER:");
        int a = Integer.parseInt (scan.nextLine ());
        int area = a*a;
        System.out.println(area);
    }

}
