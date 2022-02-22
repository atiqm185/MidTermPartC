/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package midtermexam_versiona_extensioncode;
import java.util.Scanner;
/**
 *
 * @author izanr
 */
public class TestUserProfile {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        String id;
        int genre;
        System.out.println("Enter the User ID you wish to register with.");
        id = input.nextLine();
        System.out.println("Please select yout favorite genre of movies:\n0: Comedy\n1: Drama\n2: Action\n3: Mystery");
        genre = input.nextInt();
        System.out.println("Profile created!");
    }
}
