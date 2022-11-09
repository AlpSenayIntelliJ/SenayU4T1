import java.util.Scanner;
public class Other {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = scan.nextInt();
        while (num <= 0) {
            System.out.print("Enter a positive integer: ");
            num = scan.nextInt();
        }
        System.out.print("You did it!");
    }
}
