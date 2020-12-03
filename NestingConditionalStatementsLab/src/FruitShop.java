import java.util.Scanner;
public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String day = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPrice=0;
        switch (day){
            case"Monday":
            case"Tuesday":
            case"Wednesday":
            case"Thursday":
            case"Friday":
                switch (fruit){
                    case"banana":
                        productPrice=quantity*2.50;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"apple":
                        productPrice=quantity*1.20;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"orange":
                        productPrice=quantity*0.85;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"grapefruit":
                        productPrice=quantity*1.45;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"kiwi":
                        productPrice=quantity*2.70;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"pineapple":
                        productPrice=quantity*5.50;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"grapes":
                        productPrice=quantity*3.85;
                        System.out.printf("%.2f",productPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            case"Saturday":
            case"Sunday":
                switch (fruit){
                    case"banana":
                        productPrice=quantity*2.70;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"apple":
                        productPrice=quantity*1.25;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"orange":
                        productPrice=quantity*0.90;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"grapefruit":
                        productPrice=quantity*1.60;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"kiwi":
                        productPrice=quantity*3.00;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"pineapple":
                        productPrice=quantity*5.60;
                        System.out.printf("%.2f",productPrice);
                        break;
                    case"grapes":
                        productPrice=quantity*4.20;
                        System.out.printf("%.2f",productPrice);
                        break;
                    default:
                        System.out.println("error");
                        break;
                }
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}