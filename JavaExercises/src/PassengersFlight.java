import java.util.Scanner;

public class PassengersFlight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int airlinesNumber = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        double mostPeople =0;
        int flights = 0;
        double sumPeople = 0.0;
        double average = 0.0;
        mostPeople = Integer.MIN_VALUE;
        for (int airlineNames = 1; airlineNames <= airlinesNumber ; airlineNames++) {
            String airlineName = scanner.nextLine();
            input = scanner.nextLine();
            while(!input.equals("Finish")){
                int peopleFlight=Integer.parseInt(input);
                sumPeople += peopleFlight;
                average = sumPeople / airlinesNumber;
                flights++;
                input = scanner.nextLine();
            }
                System.out.printf("%s:%.0f passengers",input,Math.floor(average));
            if (average>mostPeople){
                mostPeople = average;
        }
            }
              System.out.printf("%s has most passengers per flight: %.0f",input,Math.floor(mostPeople));
    }
}
