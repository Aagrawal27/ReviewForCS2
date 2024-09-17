// CoffeeDrink object class

class Drink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public Drink(int numberOfCups, String flavor, boolean hasWhippedCream){
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        this.numberOfCups = numberOfCups;
        this.flavor = flavor;
        this.hasWhippedCream = hasWhippedCream;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        System.out.print("You ordered " + numberOfCups + ", " + flavor + " flavored drink(s). Your order " );

        if(hasWhippedCream == true){
            System.out.println("has whipped cream");
        }else{
            System.out.println("does not have whipped cream");
        }
        // Include information stored in each variable.

    }
}
