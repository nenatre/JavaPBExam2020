import java.util.Scanner;

public class CalorieCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String sex = scanner.nextLine();
        double kg = Double.parseDouble(scanner.nextLine());
        double m = Double.parseDouble(scanner.nextLine()) *100;
        int age = Integer.parseInt(scanner.nextLine());
        String activity  = scanner.nextLine();
        double bnm;
        if(sex.equals("m")) {
            bnm = 66+ (13.7 * kg)+(5*m)-(6.8*age);
        }else{
            bnm = 655 + (9.6 * kg)+(1.8*m)-(4.7*age);
        }
        switch (activity){
            case("sedentary"):
                bnm = bnm * 1.2;
                break;
            case("lightly active"):
                bnm = bnm * 1.375;
                break;
            case("moderately active"):
                bnm = bnm * 1.55;
                break;
            case("very active"):
                bnm = bnm * 1.725;
                break;
        }
        System.out.printf("To maintain your current weight you will need %.0f calories per day.",Math.ceil(bnm));
    }
}
