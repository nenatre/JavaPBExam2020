import java.util.Scanner;

public class InchToCentimeters_04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println ("Enter number for converting:");
        double a = Double.parseDouble (scan.nextLine ());
        double convert_size = a * 2.54;
        System.out.println (convert_size);

    }
}
