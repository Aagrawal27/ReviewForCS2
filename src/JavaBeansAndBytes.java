/**
 * CS2 Review Assignment!
 * Do NOT use ChatGPT or any other generative AI to assist you with this assignment
 * You may reference your own past work and the internet (not including AI)
 */
import java.util.Scanner;

public class JavaBeansAndBytes {

    // Variables for the CoffeeShop
    String name;
    boolean isOpen;
    int yearFounded;
    Scanner drinkorder = new Scanner(System.in);

    public static void main(String[] args) {
        // Create a new CoffeeShop instance to run everything.
        JavaBeansAndBytes cafe = new JavaBeansAndBytes();
    }

    // Constructor for CoffeeShop
    public JavaBeansAndBytes() {
        name = "Java Beans & Bytes: The Code Café";
        isOpen = true;
        yearFounded = 1995;

        System.out.println("Welcome to " + name + "!");
        if (isOpen) {
            System.out.println("We are open!");
        } else {
            System.out.println("We are closed :(");
        }
        System.out.println("We were founded in " + yearFounded + ".");

        // TODO
        // Update the year founded and print the new yearFounded in a sentence
        yearFounded = 2009;
        System.out.println("We were actually founded in " + yearFounded + ".");

        // Calling methods
        randomDiscount();

        // TODO
        // Add parameter to specialOfTheDay (drink of your choice)
        specialOfTheDay("Hot Chocolate");
        countCups();
        baristasChoice();

        // TODO
        // Create two CoffeeDrink objects
        System.out.println("What is the name of this order?");
        String orderName = drinkorder.nextLine();

        System.out.println("What flavor of drink would you like?");
        String flavor = drinkorder.nextLine();

        System.out.println("How many cups would you like?");
        Integer amountOfCups = drinkorder.nextInt();

        System.out.println("Do you want whipped cream with your order? (True or False)");
        Boolean yWhippedCream = drinkorder.nextBoolean();

        Drink newOrder = new Drink(amountOfCups, flavor, yWhippedCream, orderName);


        // TODO
        // Print out the order details
        newOrder.printInfo();


    }

    // Method to generate a random discount
    public void randomDiscount() {
        // TODO
        // Make this method generate a random integer discount (0-30%)
        int RandDis = (int)(31*Math.random());
        // while method
        while(RandDis<26){
            RandDis = (int)(31*Math.random());
        }
        // and print the result.
//        System.out.println("Today's discount is: " + RandDis + "% !");
        
    }

    // Method with a parameter for the special of the day
    public void specialOfTheDay(String SotD) {
        // TODO
        // Make this method accept a parameter representing the day’s special.
        // Print the day's special.
        System.out.println("Today's special is: " + SotD + ".");
    }

    // Method to show loops
    public void countCups() {
        System.out.println("Counting cups sold today:");

        // TODO
        // Write three different for loops that print the indicated numbers:

        // Print 1 to 5
        for (int i = 1; i<6; i++){
            System.out.print(i + " ");
        }

        System.out.print("\n");
        // Print 2, 5, 8, 11
        for (int i = 2; i<12; i+=3 ){

            System.out.print(i + ", ");
        }

        System.out.print("\n");
        // Print 8 to 0
        for (int i = 8; i>-1; i-=1){
            System.out.print(i + " ");
        }

        System.out.print("\n");
    }

    // Method to recommend a coffee based on a random number
    public void baristasChoice() {
        // TODO
        // Make this method generate a random decimal between 0 and 1
        int Rec = (int)(4*Math.random());
        System.out.print("Recommended drink today is: ");
        // and print one of four drink recommendations based on its value.
        if(Rec ==0 ){
            System.out.println("Ice Cold Chocolate.");
        }else if(Rec ==1){
            System.out.println("Cool Chocolate.");
        }else if(Rec ==2){
            System.out.println("Lukewarm Chocolate.");
        }else if(Rec ==3){
            System.out.println("Scalding Chocolate.");
        }
    }
}

