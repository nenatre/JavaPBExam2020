import java.util.Scanner;

public class ProgrammingBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pricePerPage = Double.parseDouble(scanner.nextLine());
        double pricePerCover = Double.parseDouble(scanner.nextLine());
        int discountBook = Integer.parseInt(scanner.nextLine());
        double sumDesigner = Double.parseDouble(scanner.nextLine());
        double teamMoney = Double.parseDouble(scanner.nextLine());
        int bookPages = 899;
        int covers = 2;
        double bookCalculationPrice = pricePerPage * bookPages + pricePerCover *covers;
        double bookWithDiscount = bookCalculationPrice*(1- 1.0*discountBook/100);
        double sumWithDesignerExpensis = bookWithDiscount + sumDesigner;
        double finalSumBook = sumWithDesignerExpensis *(1-teamMoney/100);
        System.out.printf("Avtonom should pay %.2f BGN.",finalSumBook);
    }
}
