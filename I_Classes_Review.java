public class I_Classes_Review {
    String breed;
    boolean hasOwner;
    int age;
    int weight;
    String hairColor;
    boolean aggressive;

    public I_Classes_Review(String dogBreed, boolean dogOwned, int dogYears, int dogWet, String dogColor, boolean dogAggressive) {
        System.out.println("Constructor invoked");
        breed = dogBreed;
        hasOwner = dogOwned;
        age = dogYears;
        weight = dogWet;
        hairColor = dogColor;
        aggressive = dogAggressive;
    }

    public static void main(String[] args) {
        System.out.println("Main method started");
        I_Classes_Review maxy = new I_Classes_Review("German shepherd",true,4,34, "black and brown", true);
        I_Classes_Review amy = new I_Classes_Review("Speech",true,6,27, "white", false);

        boolean isFidoOlder = maxy.age > amy.age;
        int totalDogYears = maxy.age + amy.age;
        int higherWeight = maxy.weight - amy.weight;
        System.out.println("\nTwo dogs created: a " + maxy.breed + " and a " + amy.breed);
        System.out.println("The statement that maxy is an older dog is: " + isFidoOlder);
        System.out.println("The total age of the dogs is: " + totalDogYears);
        System.out.println("Maxy is "+higherWeight+"kg weight than amy.");
        System.out.println("Maxy is " + maxy.hairColor + " in color.\n"+ "Amy is " +amy.hairColor+ " in color.");
        System.out.println("Maxy is aggressive its: " + maxy.aggressive + " .\n"+ "Amy is aggressive its: " +amy.aggressive);
        System.out.println("Main method finished.");


        System.out.println(maxy.breed);
        System.out.println(amy.breed);
    }

}
