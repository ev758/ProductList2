import java.util.Scanner;
import java.util.LinkedList;

public class ProductList2 {

    public static void main(String[] args) {
        //declarations
        Scanner productObj = new Scanner(System.in);
        Scanner priceObj = new Scanner(System.in);
        Scanner numObj = new Scanner(System.in);
        Scanner taxRateObj = new Scanner(System.in);
        LinkedList<String> productNameObj = new LinkedList<String>();
        LinkedList<Double> pricelistObj = new LinkedList<Double>();
        int num;
        double taxRate;
        double total = 0;

        //get user input
        //User enters the number of products
        System.out.print("Enter the number of products: ");
        num = numObj.nextInt();
        System.out.println("");

        //User enters each of the product's names
        System.out.println("Enter each products' names: ");
        for (int i = 0; i < num; i++) {
            productNameObj.add(productObj.nextLine());
        }
        System.out.println("");

        //User enters each of the product's prices
        System.out.println("Enter the prices of the products: ");
        for (int i = 0; i < num; i++) {
            System.out.print("$");
            pricelistObj.add(priceObj.nextDouble());
        }
        System.out.println("");

        //User enters the tax rate based on their current area
        System.out.print("Enter the tax rate based on current area.\n");
        System.out.println("An example of entering tax rate: 1.087");
        taxRate = taxRateObj.nextDouble();

        //Total Price is Calculated
        for (int i = 0; i < num; i++) {
            total = total + pricelistObj.get(i);
        }
        total = total * taxRate;
        System.out.println("");

        //output
        //Displays the list of products and price
        System.out.println("Here is the list of products:");
        System.out.printf("%-40s%s%n", "Products", " Prices");
        for (int i = 0; i < num; i++) {
            System.out.printf("%-40s $%.2f%n", productNameObj.get(i), pricelistObj.get(i));
        }
        System.out.printf("Total: $%.2f", total);

    }
}
