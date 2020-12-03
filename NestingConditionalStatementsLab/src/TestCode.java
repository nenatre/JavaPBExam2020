import java.util.Scanner;
public class TestCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfDays = Integer.parseInt(scanner.nextLine());
        String typeOfAccommodation = scanner.nextLine();
        String score = scanner.nextLine();
        int roomForOnePerNight = 18;
        int apartmentPerNight = 25;
        int presidentApartmentPerNight = 35;
        int numberofNights = numberOfDays -1;
        double finalprice = 0.0;
        switch (typeOfAccommodation) {
            case "room for one person":
                if (numberofNights <= 10 || numberofNights < 15 || numberofNights >= 15) {
                    finalprice = roomForOnePerNight * numberofNights;
                    if (score.equals("positive")) {
                        finalprice *= 1.25;
                        System.out.printf("%.2f", finalprice);
                        if (score.equals("negative")) {
                            finalprice *= 0.90;
                            System.out.printf("%.2f", finalprice);
                        }}
                }
                break;
            case "apartment":
                if (numberofNights <= 10) {
                    finalprice = (apartmentPerNight * numberofNights) * 0.70;
                } else if (numberofNights < 15) {
                    finalprice = (apartmentPerNight * numberofNights) * 0.65;
                }else if (numberofNights >= 15){
                    finalprice = (apartmentPerNight * numberofNights) * 0.5;
                }
                if (score.equals("positive")) {
                    finalprice *= 1.25;
                    System.out.printf("%.2f", finalprice);
                    if (score.equals("negative")) {
                        finalprice *= 0.90;
                        System.out.printf("%.2f", finalprice);
                    }}
                break;
            case "president apartment":
                if (numberofNights <= 10) {
                    finalprice = (presidentApartmentPerNight * numberofNights) * 0.90;
                } else if (numberofNights < 15) {
                    finalprice = (presidentApartmentPerNight * numberofNights) * 0.85;
                }else if (numberofNights >= 15){
                    finalprice = (presidentApartmentPerNight * numberofNights) * 0.8;
                }
                if (score.equals("positive")) {
                    finalprice *= 1.25;
                    System.out.printf("%.2f", finalprice);
                }else if (score.equals("negative")) {
                    finalprice *= 0.90;
                    System.out.printf("%.2f", finalprice);
                }
                break;
            default:break;
        }
    }}


