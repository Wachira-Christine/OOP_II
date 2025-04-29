// use of variables

//Code is meant to be able to check balance, withdraw and deposit money from a specific account
public class challenge2 {
    //Attributes
    String accountNumber;
    double Balance;

    //Methods/behaviours
    void withdraw(double amount)
    {
        Balance = Balance - amount;
    }

    void deposit(double amount)
    {
        Balance = Balance + amount;
    }

    double checkBalance()
    {
        return Balance;
    }

    public static void main(String[] args){
        //Create instances/object from the bankAccount class

        challenge2 myAccount;//object declaration

        myAccount = new challenge2();//object creation

        //call methods
        myAccount.deposit(4000);

        myAccount.withdraw(1500);

        System.out.println(myAccount.checkBalance());
    }
}
