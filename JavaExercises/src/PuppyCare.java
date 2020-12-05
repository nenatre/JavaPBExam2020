import java.util.Scanner;
public class PuppyCare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int kgFood=Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int grFoodSum= 0;
        int foodInGr = kgFood *1000;
        while(!input.equals("Adopted")){
           double grFood = Integer.parseInt(input);
           grFoodSum+=grFood;
           input= scanner.nextLine();
        }
        int food = foodInGr - grFoodSum;
        if(foodInGr >= grFoodSum){
            System.out.printf("Food is enough! Leftovers: %d grams.",food);
        }else{
            System.out.printf("Food is not enough! Leftovers: %d grams.",Math.abs(food));
        }
    }
}
