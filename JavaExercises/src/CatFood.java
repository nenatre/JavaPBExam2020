import java.util.Scanner;

public class CatFood {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int catNumber = Integer.parseInt(scanner.nextLine());
        int smallCats = 0;
        int bigCats = 0;
        int hugeCats = 0;
        double gramFood = 0.0;
        for (int i = 0; i < catNumber; i++) {
            double food = Double.parseDouble(scanner.nextLine());
            if(food < 200){
                gramFood +=food;
                smallCats++;
            }else if(food < 300){
                gramFood +=food;
                bigCats ++;
            }else if(food < 400){
                gramFood+=food;
                hugeCats ++;
            }
        }
        double moneyForFood = gramFood /1000 * 12.45;
        System.out.printf("Group 1: %d cats.%n",smallCats);
        System.out.printf("Group 2: %d cats.%n",bigCats);
        System.out.printf("Group 3: %d cats.%n",hugeCats);
        System.out.printf("Price for food per day: %.2f lv.",moneyForFood);
    }
}
