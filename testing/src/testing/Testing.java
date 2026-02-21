/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testing;

import java.util.ArrayList;

/**
 *
 * @author macbookair
 */
public class Testing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Food food1 = new Food("pizza");
        Food food2 = new Food("burger");
        Food food3 = new Food("hotdog");
        
        Food[] refrigrator = {food1, food2, food3};
        
        for(Food food : refrigrator) {
            System.out.println(food.name);
        }
        
    }
    
}
