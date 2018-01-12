package oop;

public class BankAccount implements IRate {
    //define variables
    String accountNumber;

    //static>> belongs to the CLASS not the object instance
    //final >>consant(often static final)
    private static final String routingNumber = "01356";

    //instance variables
    private String name;
    private String ssn;
    String accountType;
    double balance = 0;

    //Constructor definitions unique methods
    //1. They ae used to define/setup/initalize properties of an object
    //2. Constructors are IMPLICITLY called upon instantiation
    //3. The same name as the class itself
    //4. Constructors have no return type


    BankAccount(){
        System.out.println("New Account Created");
    }
    //Overloading: call the same method name with different arguments
    BankAccount(String accountType){
        System.out.println("New Account: " + accountType);
    }
    BankAccount(String accountType, double initDeposit){
        //initDeposit, accountType, Msg are all local variables
        System.out.println("New Account: " + accountType);
        System.out.println("inital deposit of:$ " + initDeposit);
        String Msg = null;
        if(initDeposit < 1000){
            Msg = "ERROR: Minmum deposit must be at least $1000";

        }else{
            Msg = "Thanks for your initial deposit of : $" + initDeposit;
        }
        System.out.println(Msg);
        balance = initDeposit;
    }


    //Getters / Setters
    //allow the user to define the name
    public void setName(String name){
        this.name = "Mr." + name;
    }

    public String getName(){
        return name;
    }

    public void setSSN(String ssn){
        this.ssn = ssn;
    }

    public String getSSN(){
        return ssn;
    }

    //Interface Method
    public void setRate(){
        System.out.println("SETTING RATE");
    }

    public void increaseRate(){
        System.out.println("Increase rate");
    }




    //define methods
    public void deposit(double amount){
        balance = balance + amount;
        showActivity("Deposit");
    }
    void withdraw(double amount){
        balance = balance + amount;
        showActivity("Withdraw");
    }
    //private: can only be called from within the class
    private void showActivity(String activity){
        System.out.println("Your recent transaction: " + activity);
        System.out.println("Your new Balance is: $" + balance);
    }

    void checkBalance(){
        System.out.println("Balance:  " + balance);

    }
    void getStatus(){

    }
    @Override
    public String toString(){
        return"[NAME:" + name + "." + accountNumber + ". Routing a" + routingNumber + ".BALANCE: $" + balance + "]";
    }

}
