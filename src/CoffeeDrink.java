// CoffeeDrink object class

class CoffeeDrink {

    int numberOfCups;
    String flavor;
    boolean hasWhippedCream;

    // Constructor for CoffeeDrink class
    public CoffeeDrink(int numberOfCupsI, String flavorI,  boolean hasWhippedCreamI){
        // TODO
        // Edit this constructor to accept three parameters,
        // one for each CoffeeDrink variable.
        // Assign those parameter values to the class-wide variables.
        numberOfCups = numberOfCupsI;
        flavor = flavorI;
        hasWhippedCream = hasWhippedCreamI;
    }

    // Method to print information about the CoffeeDrink
    public void printInfo() {
        // TODO
        // Make this method print order details.
        System.out.println("You ordered " + numberOfCups + ", " + flavor + " flavored cups of coffee. It is " + hasWhippedCream + " that your drinks have whipped cream.");
        // Include information stored in each variable.

    }
}
