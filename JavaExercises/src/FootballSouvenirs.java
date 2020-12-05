import java.util.Scanner;

public class FootballSouvenirs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String team = scanner.nextLine();
        String souvenirs = scanner.nextLine();
        int numberSouvenirs = Integer.parseInt(scanner.nextLine());
        double sumOfSouvenirs = 0.0;
        double prices = 0.0;
        boolean stocks = false;
        boolean country = false;
        switch (souvenirs) {
            case "flags":
                if ("Argentina".equals(team)) {
                    prices = 3.25;
                } else if ("Brazil".equals(team)) {
                    prices = 4.20;
                } else if ("Croatia".equals(team)) {
                    prices = 2.75;
                } else if ("Denmark".equals(team)) {
                    prices = 3.10;
                } else {
                    country = true;
                }
                break;
            case "caps":
                if ("Argentina".equals(team)) {
                    prices = 7.20;
                } else if ("Brazil".equals(team)) {
                    prices = 8.50;
                } else if ("Croatia".equals(team)) {
                    prices = 6.90;
                } else if ("Denmark".equals(team)) {
                    prices = 6.50;
                } else {
                    country = true;
                }
                break;
            case "posters":
                if ("Argentina".equals(team)) {
                    prices = 5.10;
                } else if ("Brazil".equals(team)) {
                    prices = 5.35;
                } else if ("Croatia".equals(team)) {
                    prices = 4.95;
                } else if ("Denmark".equals(team)) {
                    prices = 4.80;
                } else {
                    country = true;
                }
                break;
            case "stickers":
                if ("Argentina".equals(team)) {
                    prices = 1.25;
                } else if ("Brazil".equals(team)) {
                    prices = 1.20;
                } else if ("Croatia".equals(team)) {
                    prices = 1.10;
                } else if ("Denmark".equals(team)) {
                    prices = 0.90;
                } else {
                    country = true;
                }
                break;
            default:
                stocks = true;
                break;
        }
        sumOfSouvenirs = prices * numberSouvenirs;
        if (stocks){
            System.out.println("Invalid stock!");
        }else if(country){
            System.out.println("Invalid country!");
        }else{
            System.out.printf("Pepi bought %d %s of %s for %.2f lv.", numberSouvenirs, souvenirs, team, sumOfSouvenirs);
        }
    }
}
