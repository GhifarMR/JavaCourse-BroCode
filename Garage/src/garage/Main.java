/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package garage;

/**
 *
 * @author macbookair
 */
public class Main {
    public static void main(String[] args) {
        Garage garage = new Garage();
        
        Car car1 = new Car("BMW");
        garage.park(car1);
        
        System.out.println(car1.name);
    }
}
