//this program test account.java capabilities

//import declaration
import java.util.Scanner;

//class declaration
public class accounTester {//class begins

//method declaration
public static void main(String[] args) {//method begins

//scanner declaration
Scanner Input = new Scanner(System.in);

//object PROFILE creation
 account myProfile = new account();

//initiating the initial name(null)
  System.out.printf("Initial name is:%n%s%n", myProfile.getProfile());

//Prompt for and to store PROFILE name
    System.out.println("ENTER PROFILE NAME: ");
     String setProfile = Input.nextLine();
      myProfile.setProfile(setProfile);
       System.out.println();

//statement declaration
        System.out.printf("Your profile name is: %s%n", myProfile.getProfile());
         System.out.printf("Welcome on board %s%n", myProfile.getProfile());


}//method body ends
}//class body ends
