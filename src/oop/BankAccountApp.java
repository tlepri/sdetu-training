package oop;

public class BankAccountApp  {
    public static void main(String[] args){
        //creating a new bank account >> think instantiate an object

        BankAccount acc1 = new BankAccount();
       // acc1.name = "Roger Hue";
        //with encapsulation: public API methods
        acc1.setName("Roger Hue");
        System.out.println(acc1.getName());

        acc1.setSSN("234823423");
        System.out.println("SSN: " + acc1.getSSN());


        acc1.accountNumber = "78787665";

        acc1.balance = 10000;

        acc1.setRate();
        acc1.increaseRate();

        acc1.deposit(1500);


        //polymorphism through overriding
        System.out.println(acc1.toString());

        //Polymorphism through overloading
        BankAccount acc2 = new BankAccount("Checking Account");
        acc2.accountNumber = "78787665";

        BankAccount acc3 = new BankAccount("savings",5000);
        acc3.accountNumber = "78787665";


       /* acc3.checkBalance();


        //Demo for inheritance
        CDAccount cd1 = new CDAccount();
        cd1.balance = 3000;
        cd1.name = "Juan";
        cd1.accountType = "CD account";
        System.out.println(cd1.toString());*/
        //cd1.compount();

//        System.out.println(acc1.routingNumber);
//        System.out.println(acc2.routingNumber);
//        System.out.println(acc3.routingNumber);



    }
}
