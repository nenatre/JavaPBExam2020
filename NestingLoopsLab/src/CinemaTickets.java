import java.util.Scanner;

public class CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String movie = "";
        String input = "";
        int standardTickets = 0;
        int studentTickets = 0;
        int kidsTickets = 0;
        int sumTickets = 0;
        int totalTickets = 0;
        while (!input.equals("Finish")) {
            sumTickets = 0;
            movie = scanner.nextLine();
            int soldTickets = Integer.parseInt(scanner.nextLine());
            input = scanner.nextLine();
            while (!input.equals("End") ^ input.equals("Finish")) {
                switch (input) {
                    case "standard":
                        standardTickets++;
                        sumTickets++;
                        break;
                    case "student":
                        studentTickets++;
                        sumTickets++;
                        break;
                    case "kid":
                        kidsTickets++;
                        sumTickets++;
                        break;
                }
                input = scanner.nextLine();
            }
            totalTickets += sumTickets;
            double percentTickets = 1.0 * sumTickets / soldTickets * 100;
            System.out.printf("%s %.2f%% full.%n", movie, percentTickets);
//            movie=scanner.nextLine();
        }
        double studentsTicketsPercent = 1.0 * studentTickets / totalTickets * 100;
        double standardTicketsPercent = 1.0 * standardTickets / totalTickets * 100;
        double kidsTicketsPercent = 1.0 * kidsTickets / totalTickets * 100;
        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%%  student tickets%n", studentsTicketsPercent);
        System.out.printf("%.2f%%  standard tickets%n", standardTicketsPercent);
        System.out.printf("%.2f%%  kids tickets%n", kidsTicketsPercent);
    }
}
