package basics;

public class SalaryCalculator {
    public static void main(String[] args){
        //lets create a variable to define our career

        //declare a variable
        String career;
        System.out.println("Program is starting");
        career = "Software Developer";
        System.out.println("My career: " + career);

        //Decalre & define
        int hoursPerWeek = 40;
        int weeksPerYear = 50;
        double rate = 42.50;

        double salary = hoursPerWeek * weeksPerYear * rate;
        System.out.println("My salary as a " + career + " at the rate of $" + rate + "is $" + salary);

        //computer our annual salary
        //rate*hoursPerWeek * weeksPerYear
    }
}
