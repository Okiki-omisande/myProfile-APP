//this program supports and fulfill the functionalities of program bankaccount

//import declaration
import java.util.Scanner;

//class declaration
public class bankaccounTester
{
//method declaration
public static void main(String[] args) {
//create two account objects
    bankaccount account1 = new bankaccount("Okiki", 100.00);
     bankaccount account2 = new bankaccount("Joel", 303.17);

//create an initial bankaccount
      System.out.printf("%n Initial detail in bankaccount1 is:%s $%.2f ", account1.getName(), account1.getBalance());
       System.out.printf("%n Initial detail in bankaccount2 is:%s $%.2f%n%n", account2.getName(), account2.getBalance());

//scanner declaration
        Scanner input = new Scanner(System.in);

//create a deposit in account1
         System.out.println("Please enter account1 deposit amount:" );
         double deposit1 = input.nextDouble();
          account1.deposit(deposit1);
          System.out.printf("%n adding $%.2f in balance%n", deposit1);

//prompt to display both bankaccount
           System.out.printf("%n %s balance: $%.2f", account1.getName(), account1.getBalance());
            System.out.printf("%n %s balance: $%.2f%n%n", account2.getName(),account2.getBalance());

//creating a deposit for account2
             System.out.println("please enter account2 deposit amount:");
              double deposit2 = input.nextDouble();
               account2.deposit(deposit2);
                System.out.printf("%n adding $%.2f to balance %n%n", deposit2);

//prompt to display both bankaccount
                 System.out.printf("%s balance $%.2f%n",account1.getName(),account1.getBalance());
                  System.out.printf("%s balance $%.2f%n",account2.getName(),account2.getBalance());



}
}
