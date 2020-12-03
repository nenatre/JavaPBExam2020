import java.util.Scanner;

public class GreenYards_09 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        double squareMeters = Double.parseDouble (scan.nextLine ());
        double squarePrice = squareMeters * 7.61;
        double discount = squarePrice * 0.18;
        double totalPrice = squarePrice - discount;
        System.out.printf ("The final price is: %.2f lv.", totalPrice);
        System.out.printf ("The discount is: %.2f lv.", discount);



    }
}
