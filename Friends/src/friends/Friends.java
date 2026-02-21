/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package friends;

/**
 *
 * @author macbookair
 */
public class Friends {
    public String name;
    static int numberOfFriend = 0;
    
    public Friends(String name) {
        this.name = name;
        numberOfFriend++;
    }
    
    public static void displayFriends() {
        System.out.println("You have " + numberOfFriend + " friends");
    }
    
}
