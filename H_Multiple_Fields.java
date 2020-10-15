public class H_Multiple_Fields {
    //instance fields with multiple variable.
    String productType;
    int inventoryCount;
    double inventoryPrice;


    // new parameters that correspond to the new fields
    public H_Multiple_Fields(String product, int count, double price) {
        productType = product;
        // assign new parameters to the new fields
        inventoryCount = count;
        inventoryPrice = price;
    }
    //main method
    public static void main(String[] args) {
        //Multiple instance with there values [OR WE CAN SAY].
        // new values passed into the method call.
        H_Multiple_Fields cookieShop = new H_Multiple_Fields("Cookies", 12, 3.75);
        System.out.println("Name of the product: " + cookieShop.productType);
        System.out.println("Number of product: " + cookieShop.inventoryCount);
        System.out.println("Price of the product: Rs " + cookieShop.inventoryPrice + '\n');

        //Another instance or object named shoesShop.
        H_Multiple_Fields shoesShop = new H_Multiple_Fields("adidas", 4, 12500);
        System.out.println("Name of the product: " + shoesShop.productType);
        System.out.println("Number of product: " + shoesShop.inventoryCount);
        System.out.println("Price of the product: Rs " + shoesShop.inventoryPrice + '\n');

        //Another instance.
        H_Multiple_Fields hpStore = new H_Multiple_Fields("Battery", 2, 8000);
        System.out.println("Name of the product: " + hpStore.productType);
        System.out.println("Number of product: " + hpStore.inventoryCount);
        System.out.println("Price of the product: Rs " + hpStore.inventoryPrice);

    }
}
