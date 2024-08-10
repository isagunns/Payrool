import java.util.Scanner;

public class Payrool {
    public static void main(String[] args) {
        String name;
        int hours;
        double payRate;
        double groosPay;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your name:");
        name = scanner.nextLine();
        System.out.println("How many hours did you work in this week?:");
        hours = scanner.nextInt();
        System.out.println("What is your hourly pay rate?:");
        payRate = scanner.nextDouble();
        groosPay = payRate * hours;
        System.out.println("Hello " + name);
        System.out.println("Your gross pay is $" + groosPay);
        scanner.close();

    }
}
