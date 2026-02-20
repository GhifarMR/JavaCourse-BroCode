/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package shoppingcartprogram;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class ShoppingCartProgram {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scanner = new Scanner(System.in);
        
        System.out.print("What item would you like to buy? : ");
        String productName = scanner.nextLine();
        
        System.out.print("What is the price for each? : ");
        double productPrice = scanner.nextDouble();
        scanner.nextLine();
        
        System.out.print("How many you like? : ");
        int productQuantity = scanner.nextInt();
        scanner.nextLine();
            
        while(productQuantity < 1) {
            System.out.println("Minimum order 1");
            System.out.print("How many you like? : ");
            productQuantity = scanner.nextInt();
            scanner.nextLine();
        }
        
        String currency = "$";
        generateReceipt(productName, productPrice, productQuantity, currency);
        
    }
    
    public static void generateReceipt(String productName, double productPrice, int productQuantity, String currency) {
        double total = productPrice * productQuantity;
        
        System.out.println("\n----------Receipt----------");
        
        if(productQuantity > 1) {
            System.out.println("You have bought " + productQuantity + " " + productName + "'s");
        } else {
            System.out.println("You have bought " + productQuantity + " " + productName);
        }
        
        System.out.println("Your total is " + currency + total);
        
        System.out.println("---------------------------");
    }
    
}
