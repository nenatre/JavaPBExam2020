import java.util.Scanner;

public class Travelling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String destination = scanner.nextLine();
        while(!destination.equals("End")){
            double needMoney = Double.parseDouble(scanner.nextLine());
            double totalSavedMoney = 0;
            while(totalSavedMoney < needMoney){
                double savedMoney = Double.parseDouble(scanner.nextLine());
                totalSavedMoney += savedMoney;
            }
            System.out.printf("Going to %s!%n", destination);
            destination = scanner.nextLine();
        }

    }
}
