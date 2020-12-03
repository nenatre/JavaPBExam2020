import java.util.Scanner;
public class SmallShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String product = scanner.nextLine();
        String city = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double productPrice=0;
        switch (city){
            case"Sofia":
                switch (product){
                    case"coffee":
                        productPrice=quantity*0.50;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"water":
                        productPrice=quantity*0.80;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"beer":
                        productPrice=quantity*1.20;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"sweets":
                        productPrice=quantity*1.45;
                        System.out.printf("%.4f",productPrice);
                        break;
                    case"peanuts":
                        productPrice=quantity*1.60;
                        System.out.printf("%.1f",productPrice);
                        break;
                    default:break;
                }
                break;
            case"Varna":
                switch (product){
                    case"coffee":
                        productPrice=quantity*0.45;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"water":
                        productPrice=quantity*0.70;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"beer":
                        productPrice=quantity*1.10;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"sweets":
                        productPrice=quantity*1.35;
                        System.out.printf("%.5f",productPrice);
                        break;
                    case"peanuts":
                        productPrice=quantity*1.55;
                        System.out.printf("%.1f",productPrice);
                        break;
                    default:break;
                }
                break;
            case"Plovdiv":
                switch (product){
                    case"coffee":
                        productPrice=quantity*0.40;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"water":
                        productPrice=quantity*0.70;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"beer":
                        productPrice=quantity*1.15;
                        System.out.printf("%.1f",productPrice);
                        break;
                    case"sweets":
                        productPrice=quantity*1.30;
                        System.out.printf("%.4f",productPrice);
                        break;
                    case"peanuts":
                        productPrice=quantity*1.50;
                        System.out.printf("%.1f",productPrice);
                        break;
                    default:break;
                }
                break;
            default:break;
        }
    }
}
