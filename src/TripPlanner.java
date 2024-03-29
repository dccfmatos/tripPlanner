import java.util.Scanner;

public class TripPlanner {
    public static void main(String[] args) {
        //part1();
        part2();
        //part3();
        //part4();
    }

    public static void part1() {

        //PART_1
        //Greeting
        System.out.println("Welcome to vacation planner!");
        System.out.print("What is your name?");

        //Saving name from user input
        Scanner input1 = new Scanner(System.in);
        String name = input1.nextLine(); //next()- only 1 word nxtLine() - everything before the "Enter"

        //Greeting user by name and asking the place he is travelling to
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");

        //Saving place name from user input
        Scanner input2 = new Scanner(System.in);
        String place = input2.nextLine();

        //Last message with the place they entered
        System.out.println("Great! " + place + " sounds like a great trip!");

    }

    public static void part2() {

        //PART_2
        //Travel time and Budget
        System.out.print("How many days are you going to spend travelling?");

        //Saving days of travel from user input
        Scanner input3 = new Scanner(System.in);
        int days = input3.nextInt();

        System.out.print("How much money, in USD, are you planning to spend on your trip?");

        //Saving amount of money from user input
        Scanner input4 = new Scanner(System.in);
        float money = input4.nextFloat();

        System.out.print("What is the three letter currency symbol for your travel destination?");

        //Saving letter currency symbol from user input
        Scanner input5 = new Scanner(System.in);
        String symbol = input5.nextLine();

        System.out.print("How many " + symbol + " are there in 1 USD?");

        //Saving given conversion from user input
        Scanner input6 = new Scanner(System.in);
        float conversion = input6.nextFloat();

        System.out.println("If you are traveling for " + days + " days, that is the same as " + days * 24 + " hours or " + days * 24 * 60 + " minutes.");
        System.out.println("If you are going to spend " + money + " USD, that means per day you can spend up to " + money / days + " USD.");
        System.out.println("Your total budget in " + symbol + " is " + money * conversion + " " + symbol + " , which per day  is " + (money * conversion) / days + symbol);

    }

    public static void part3() {

        //PART_3
        //Time Difference
        System.out.print("What is the difference, in hours, between your home and your destination?");

        //Saving time difference from user input (0-24h)
        Scanner input7 = new Scanner(System.in);
        int time = input7.nextInt();

        System.out.println("That means that when it is midnight at home it will be " + time + "h in our travel destination"
                + " and when it's noon at home, it will be " + (12 + time) + "h at your travel destination.");

    }

    public static void part4() {

        //PART_4
        //Country Area

        System.out.print("What is the square area of your destination country in km2?");

        //Saving square area from user input
        Scanner input8 = new Scanner(System.in);
        double sqarea = input8.nextDouble();

        double sqareaM2 = (sqarea * 0.38610);

        System.out.println("In miles2 that is " + sqareaM2);

    }

    /* public static void part5() {

        //PART_5
        //Round to only have 2 decimal places
        System.out.print("How many days are you going to spend travelling?");

        //Saving days of travel from user input
        Scanner input3 = new Scanner(System.in);
        int days = input3.nextInt();

        System.out.print("How much money, in USD, are you planning to spend on your trip?");

        //Saving amount of money from user input
        Scanner input4 = new Scanner(System.in);
        float money = input4.nextFloat();

        float money100 = money*100;

        System.out.print("What is the three letter currency symbol for your travel destination?");

        //Saving letter currency symbol from user input
        Scanner input5 = new Scanner(System.in);
        String symbol = input5.nextLine();

        System.out.print("How many " + symbol + " are there in 1 USD?");

        //Saving given conversion from user input
        Scanner input6 = new Scanner(System.in);
        float conversion = input6.nextFloat();

        float conversion100 = conversion*100;

        System.out.println("If you are traveling for " + days + " days, that is the same as " + days * 24 + " hours or " + days * 24 * 60 + " minutes.");
        System.out.println("If you are going to spend " + (((int) money100)/100) + " USD, that means per day you can spend up to " + money / days + " USD.");
        System.out.println("Your total budget in " + symbol + " is " + money * (((int) conversion100)/100) + " " + symbol + " , which per day  is " + (money * conversion) / days + symbol);

    }
*/

    /*


    /*
    Part 6 – Hacker Problem - How Far?
    For extra fun, calculate the distance between the user’s home and their travel destination using the Haversine formula. https://en.wikipedia.org/wiki/Haversine_formula To do this you’ll need to ask the user to enter the longitude and latitude for their home and their travel destination. You’ll also need to do some pretty fancy math.

    To do fancy math in Java (cos, sin, squared etc…) you can use the Math Class. Here is the documentation for that: https://docs.oracle.com/javase/7/docs/api/java/lang/Math.html All the code to accomplish the hacker problem should be in its own method.

    */

}
