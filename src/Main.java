import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //variable declarations
        double price;
        double sales;
        double tax = .05;
        //processing
        System.out.println("Please enter the price of your item here");
        price = scan.nextDouble();
        sales = price * 1.05;
        System.out.println("The price of your item after tax is $" + sales + " and the price of your tax is $" + (price * .05) + ".");

    }
}
