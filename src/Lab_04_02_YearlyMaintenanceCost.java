import java.util.Scanner;
public class Lab_04_02_YearlyMaintenanceCost {
    public static void main(String[] args) {

       //Declare Variables
        double spring;
        double summer;
        double fall;
        double winter;
        double total;

        Scanner sc = new Scanner(System.in);

        //Get input

        System.out.println("Enter the Spring Maintenance Cost: ");
        spring = sc.nextDouble();

        System.out.println("Enter the Summer Maintenance Cost: ");
        summer = sc.nextDouble();

        System.out.println("Enter the Fall Maintenance Cost: ");
        fall = sc.nextDouble();

        System.out.println("Enter the Winter Maintenance Cost: ");
        winter = sc.nextDouble();

        //Compute
        total = spring + summer + fall + winter;

        //Output
        System.out.println("Your total maintenance cost is " + total + " with costs for Spring, Summer, Fall and Winter being "
                + spring + ", " + summer + ", " + fall + " and " + winter + " respectively.");
    }
}