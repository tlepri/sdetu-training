package basics;

public class NumbersCalc {

    public static void main(String[]args){
        System.out.println("Program is starting");
        printName();
        int numA = 10;
        int numb = 20;
        addNumbers(numA, numb);
        //variable
        int product = multiplyNumbers(numA, numb);
        System.out.println("The product of number " + numA + " and " + numb + " is " + multiplyNumbers(numA, numb));
        System.out.println("The product of number " + numA + " and " + numb + " is " + product);


    }
//function (method) no paramters
    static void printName(){
        System.out.println("my name is Tony");
    }
    //function (method) with paramters
    static void addNumbers(int numberA, int numberB){
        //this function will add two numbers
        int sum = numberA + numberB;
        System.out.println("The sum of number " + numberA + " and " + numberB + " is " + sum);
    }
    //function (method) with paramters return type
    static int multiplyNumbers(int valueA, int valueB){
        int product = valueA * valueB;
        addNumbers(product, product);
        return product;

    }





}
