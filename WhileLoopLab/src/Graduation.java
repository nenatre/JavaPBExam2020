import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int inputClass = 1;
        int counter = 0;
        double sum = 0;
        boolean excluded = false;
        while (inputClass <= 12) {
           double grades = Double.parseDouble(scanner.nextLine());
            if (grades < 4) {
                counter++;
                if (counter == 2) {
                    System.out.printf("%s has been excluded at %d grade", name, inputClass);
                    excluded = true;
                    break;
                }
                continue;
            }
            sum += grades;
            inputClass++;
        }
        if (!excluded){
            double average = sum / 12;
            System.out.printf("%s graduated. Average grade: %.2f",name,average);
        }
    }

}
