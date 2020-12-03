import java.util.Scanner;

public class TheArchitect_07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        String architectName = scan.nextLine ();
        int projectsNumber = Integer.parseInt(scan.nextLine ());
        int hoursForProject = projectsNumber * 3;
        System.out.printf ("The architect %s will need %d hours to complete %d project/s.", architectName, hoursForProject, projectsNumber);


    }
}
