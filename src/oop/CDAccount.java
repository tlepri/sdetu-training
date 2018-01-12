package oop;



public class CDAccount extends BankAccount implements IRate{

    void interestRate(){
        System.out.println("Compunding interest");
    }
}
