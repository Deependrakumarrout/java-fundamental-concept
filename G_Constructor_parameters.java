public class G_Constructor_parameters {

    // instance fields
    String productType;

    // constructor method
    public G_Constructor_parameters(String product) {
        productType = product;
        System.out.println(productType);
    }

    // main method
    //Inside main(), i have create an instance of G_Constructor_parameters and assign it to the
    // variable lemonadeStand. Using "lemonade" as the parameter value.
    public static void main(String[] args) {
        //Using "lemonade" as the parameter value.
        G_Constructor_parameters lemonadeStand = new G_Constructor_parameters("lemonade");

        System.out.println(lemonadeStand.productType);// <- we can also print in this way too.
    }
}
