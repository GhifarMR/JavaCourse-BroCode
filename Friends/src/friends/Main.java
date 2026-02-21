/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package friends;

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
        Friends friend1 = new Friends("Spongebob");
        Friends friend2 = new Friends("Patrick");
        Friends friend3 = new Friends("Squidward");
        
        Friends.displayFriends();
        
    }
    
}
