import java.util.Scanner;

public class ZooStore_08 {
    public static void main (String[] args){
        Scanner scan = new Scanner (System.in);
        int dogsNumber = Integer.parseInt(scan.nextLine ());
        int otherAnimals = Integer.parseInt(scan.nextLine());
        Double priceDogsFood = dogsNumber * 2.5;
        int priceOtherFood = otherAnimals * 4;
        double totalPrice = priceDogsFood + priceOtherFood;

        System.out.println (totalPrice + " " + "lv.");

    }
}
