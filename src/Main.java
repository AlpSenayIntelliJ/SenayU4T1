import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many seconds for the timer? ");
        int userNumber = scanner.nextInt();
        scanner.nextLine(); // clear string buffer
        System.out.print("Count up or down (u/d)? ");
        String choice = scanner.nextLine();

        int count = 0;
        if (choice.equals("u")) {
            while (count <= userNumber) {
                System.out.println(count);
                count++;
            }
            System.out.print("Time's up. " + userNumber + " seconds have passed");
        }
        else if (choice.equals("d")) {
            while (userNumber >= count) {
                System.out.println(userNumber);
                userNumber--;
            }
            System.out.print("Time's up. " + userNumber + " seconds have passed");
        }
        else {
            System.out.print("Error. Enter a valid entry.");
        }
    }
}
