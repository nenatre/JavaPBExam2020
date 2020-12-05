import java.util.Scanner;

public class Moving1 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int width =Integer.parseInt(scanner.nextLine());
            int lenght =Integer.parseInt(scanner.nextLine());
            int height =Integer.parseInt(scanner.nextLine());
            String boxes = scanner.nextLine();
            int space = 0;
            int boxSum = 0;
            boolean noSpace = false;
            while(!boxes.equals("Done")){
                int numberBox = Integer.parseInt(boxes);
                space = width * lenght * height;
                boxSum += numberBox;
                if (boxSum>space){
                    noSpace = true;
                    break;
                }
                boxes = scanner.nextLine();
            }
            int totalSpace = space - boxSum;
            if (noSpace){
                System.out.printf("No more free space! You need %d Cubic meters more.",Math.abs(totalSpace));
            }else{
                System.out.printf("%d Cubic meters left.",totalSpace);
            }
        }
    }

