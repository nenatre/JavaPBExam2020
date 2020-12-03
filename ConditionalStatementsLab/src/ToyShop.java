import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double excursionPrice = Double.parseDouble (scanner.nextLine ());
        int puzzles = Integer.parseInt (scanner.nextLine ());
        double puzzlePrice = 2.60;
        int talkingDolls = Integer.parseInt (scanner.nextLine ());
        double talkingDollPrice = 3;
        int teddyBears = Integer.parseInt (scanner.nextLine ());
        double teddyBearsPrice = 4.10;
        int minions = Integer.parseInt (scanner.nextLine ());
        double minionsPrice = 8.20;
        int trucks = Integer.parseInt (scanner.nextLine ());
        double trucksPrice = 2;
        double toysNumber = puzzles + talkingDolls + teddyBears + minions + trucks;
        double counter = (puzzles * puzzlePrice) + (talkingDolls * talkingDollPrice) + (teddyBears * teddyBearsPrice) + (minions * minionsPrice) + (trucks * trucksPrice);
        double budget = 0;
        double rentPayment = counter - (counter * 0.10);

        if (toysNumber >= 50) {
            counter = counter - (counter * 0.25);
            budget = counter - excursionPrice;
            System.out.printf ("Yes! %.2f lv left.", budget);
        } else if (toysNumber>=0){
            budget = excursionPrice - rentPayment;
            System.out.printf ("Not enough money! %.2f lv needed.", budget);
        }
    }
}
//   Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
//   От спечелените пари Петя трябва да даде 10% за наема на магазина. Да се пресметне
//   дали парите ще ѝ стигнат да отиде на екскурзия.
//  ako ima dosta pari o	"Yes! {оставащите пари} lv left."
//  ako nema dosta pari o	"Not enough money! {недостигащите пари} lv needed."
//  do "%.2f"