import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysOfStay = Integer.parseInt(scanner.nextLine());
        String typeOfAccommodation = scanner.nextLine();
        String rate = scanner.nextLine();
        daysOfStay -= 1;
        double price = 0.0;
        if ("room for one person".equals(typeOfAccommodation)) {
            price = daysOfStay * 18;
        } else if ("apartment".equals(typeOfAccommodation)) {
            if (daysOfStay <= 10) {
                price = (daysOfStay * 25) * 0.7;
            } else if (daysOfStay <= 15) {
                price = (daysOfStay * 25) * 0.65;
            } else {
                price = (daysOfStay * 25) * 0.5;
            }
        } else if ("president apartment".equals(typeOfAccommodation)) {
            if (daysOfStay <= 10) {
                price = (daysOfStay * 35) * 0.9;
            } else if (daysOfStay <= 15) {
                price = (daysOfStay * 35) * 0.85;
            } else {
                price = (daysOfStay * 35) * 0.8;
            }
        }
        if (rate.equals("positive")) {
            price *= 1.25;
        } else {
            price *= 0.9;
        }
        System.out.printf("%.2f", price);
    }
}
//


//•	Първи ред - дни за престой - цяло число в интервала [0...365]
//•	Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
//•	Трети ред - оценка - "positive"  или "negative

//	       "room for one person" – 18.00 лв. за нощувка
//        	"apartment" – 25.00 лв. за нощувка
//        	"president apartment" – 35.00 лв. за нощувка
