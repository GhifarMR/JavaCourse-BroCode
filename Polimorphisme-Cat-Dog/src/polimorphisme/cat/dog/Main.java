/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package polimorphisme.cat.dog;

import java.util.Scanner;

/**
 *
 * @author macbookair
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("What animal do you want?");
        System.out.print("(1 = Cat) or (2 = Dog) : ");
        int choose = scanner.nextInt();
        
        Animal animal;
        
        switch(choose) {
            case 1:
                animal = new Cat();
                animal.speak();
                break;
            case 2:
                animal = new Dog();
                animal.speak();
                break;
            default :
                animal = new Animal();
                System.out.println("Invalid input");
                animal.speak();
        }
        
    }
    
}
