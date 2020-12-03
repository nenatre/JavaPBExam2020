import java.util.Scanner;
public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String city=scanner.nextLine();
        double sales = Double.parseDouble(scanner.nextLine());
        double commissionTotal = 0;
        switch (city){
            case"Sofia":
               if (sales > 0) {
                if (sales >= 0 && sales <= 500){
                    commissionTotal = sales * 0.05;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 500 && sales <= 1000){
                    commissionTotal = sales * 0.07;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 1000 && sales <= 10000){
                    commissionTotal= sales * 0.08;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 10000){
                    commissionTotal = sales * 0.12;
                    System.out.printf("%.2f",commissionTotal);
                }}else{
                   System.out.println("error");
               }
                break;
            case"Varna":
               if (sales > 0) {
               if (sales >= 0 && sales <= 500){
                    commissionTotal = sales * 0.045;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 500 && sales <= 1000){
                    commissionTotal = sales * 0.075;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 1000 && sales <= 10000){
                    commissionTotal= sales * 0.10;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 10000){
                    commissionTotal = sales * 0.13;
                    System.out.printf("%.2f",commissionTotal);
               }}else{
                   System.out.println("error");
               }
                break;
            case"Plovdiv":
               if (sales > 0) {
                if (sales >= 0 && sales <= 500){
                    commissionTotal = sales * 0.055;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 500 && sales <= 1000){
                    commissionTotal = sales * 0.08;
                    System.out.printf("%.2f",commissionTotal);
                }else if (sales > 1000 && sales <= 10000){
                    commissionTotal= sales * 0.12;
                    System.out.printf("%.2f",commissionTotal);
                }else if(sales > 10000){
                    commissionTotal = sales * 0.145;
                    System.out.printf("%.2f",commissionTotal);
                }}else{
                   System.out.println("error");
               }
                break;
            default:
            System.out.println("error");
            }

    }
}

//0 ≤ s ≤ 500	500 < s ≤ 1 000	1 000 < s ≤ 10 000	s > 10 000
//Sofia	5%	7%	8%	12%
//Varna	4.5%	7.5%	10%	13%
//Plovdiv	5.5%	8%	12%	14.5%
//При невалиден град или обем на продажбите (отрицателно число) да се отпечата "error".