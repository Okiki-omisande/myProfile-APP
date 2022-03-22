public class bankaccount
{
    //instance variable
    private String name;
    private double balance;


    //creating a constructor
    public bankaccount(String name, double balance)
    {
      this.name = name;//assigns name to instance variable name

    //validating balance is >0.0
    if(balance > 0.0)
     this.balance = balance;//assigns balance to instance variable
    }

    //method that deposits
    public void deposit(double DepositeAmount)
    {
    if(DepositeAmount > 0.0)
     balance = balance + DepositeAmount;
    }

    //method that get balance
    public double getBalance()
    {
        return balance;
    }

    //method that sets name
    private void name (String name)
    {
       this.name = name; //stores name
    }

    //method that gets name

    public String getName()
    {
        return name; //returns name
    }
}

