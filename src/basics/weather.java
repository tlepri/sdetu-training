package basics;

public class weather {
    public static void main (String[] args){
        //This program will give suggestions of what to wear based on the weather(temperature)

        int temperature = 45;
        String sunCondition = "Overcast";


        if(temperature > 80){
            System.out.println("It's pleasent. Wear shorts and t-shirt");
        }
        else if((temperature > 60) && (sunCondition == "sunny")){
            System.out.println("It's a little cooler, Perhaps wear a long sleeve shirt and jeans");
            System.out.println("wear a hat to keep the sun out of your eys");
        }
        else if((temperature > 50) || (sunCondition == "Overcast")){
            System.out.println("This is a cool day, make sure to wear warmer clothes");

        }
        else{
            System.out.println("Looks like a cold day. Bring a sweater");
        }

        System.out.println("The program is ending");

    }

}
