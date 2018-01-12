package oop;

class Person{
    String name;
    String email;
    String phone;


    void walk(){
        System.out.println(name + " is walking");
    }

    void eat(){
        System.out.println(email);

    }

    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

public class Demo {

    public static void main(String[] args){
        //instantiating an object
        Person person1 = new Person();

        //define some properties
        person1.name = "Joe";
        person1.email = "joe@testemail.com";
        person1.phone = "7868687676";

        //abstraction
        person1.walk();
        person1.sleep();
        person1.eat();

        Person person2 = new Person();

        person2.name = "sarah";
        person2.email = "sarah@email.com";
        person2.phone = "3763763763";

        person2.walk();
        person2.eat();
        person2.sleep();


        //person

        //attributes, variables, adjectives,descriptors
//        String name = "Joe";
//        String email = "joe@testemail.com";
//        String phone = "7897894564";
//
//        //action, activity,behavoir
//        //System.out.println(name + " is walking");
//        walking(name);
//        System.out.println(name + " is eating");
//
//        //what if we wanted to do this for another person?
//        String name2 = "Sarah";
//        String email2 = "Sarah@testemail.com";
//        String phone2 = "454534345";
//
//        //action, activity,behavoir
//        //System.out.println(name2 + " is walking");
//        walking(name2);
//        System.out.println(name2 + " is eating");
//
//        //what about
//    }
//
//    //enhance by adding functions to minimize code
//    static void walking(String name){
//        System.out.println(name + " is walking");
    }

}
