public class C_Manipulating_Variable {
    public static void main(String[]  args) {
        int addition = 8+2;
        int subtraction = 8-6;
        System.out.println(subtraction);

        //Assignment:1
        int zebrasInZoo = 8;
        int giraffesInZoo = 4;
        int animalsInZoo = zebrasInZoo + giraffesInZoo;
        System.out.println("Assignment:1 - "+ animalsInZoo);
        int numZebrasAfterTrade = zebrasInZoo - 2;
        System.out.println("Assignment:1 - " + numZebrasAfterTrade);


        /*
        Assignment:2
        In main(), there is a variable called subtotal, which represents the subtotal of an amount to pay on a bill,
        and a variable called tax, which represents the amount of tax added to the subtotal.
        Create a double variable, total, that holds subtotal plus the product of subtotal and tax.
        Print the total variable!
         */

        double subtotal = 30;
        double tax = 0.0875 * subtotal ; //The tax applied here which is 2.625
        double total = subtotal + tax;
        System.out.println("Assignment:2 - " + total); //ans = 32.625


    /*
    Assignment - 3;
    There were 4 people who bought this meal together and want to split the cost.
    Create a double variable called perPerson that holds total divided by 4.
    Print the perPerson variable!
    */
        double perPerson = total / 4;
        System.out.println("Assignment:3 - "+ perPerson);


     //Modulo
     double no_of_students = 26;
     double split_into_3_gp = no_of_students % 3;
     System.out.println("Assignment:4 - " + split_into_3_gp);


     //Greater than and less than

        //Assignment:5
    /*
    *Print the expression that checks if the amount of credits you have earned, creditsEarned,
    * is greater than the number of credits you need to graduate, creditsToGraduate.
    */

        double creditsEarned = 176.5;
        double creditsOfSeminar = 8;
        double creditsToGraduate = 180;
        System.out.println(creditsEarned > creditsToGraduate);


        //Assignment:6
        /*Create a variable called creditsAfterSeminar that holds the amount of credits earned after taking a seminar,
         which is worth creditsOfSeminar credits. creditsAfterSeminar should be the sum of creditsEarned and
         creditsOfSeminar.
         Print out whether creditsToGraduate is less than creditsAfterSeminar.
         */

        double creditsAfterSeminar = creditsOfSeminar + creditsOfSeminar;
        System.out.println(creditsToGraduate>creditsAfterSeminar);

        //Assignment:7
        int songsA = 9;
        int songsB = 9;
        int albumLengthA = 41;
        int albumLengthB = 53;

        boolean sameNumberOfSongs = songsA == songsB;
        System.out.println("Assignment:7 - " + sameNumberOfSongs);

        boolean differentLength = albumLengthA != albumLengthB;
        System.out.println("Assignment:8 - " + differentLength);

        //Assignment 9:
        double recommendedWaterIntake = 8;
        double daysInChallenge = 30;
        double yourWaterIntake = 235.5;

        double totalRecommendedAmount =  recommendedWaterIntake*daysInChallenge;
        boolean isChallengeComplete = yourWaterIntake >= totalRecommendedAmount;
        System.out.println("Assignment:9 - " + isChallengeComplete);


        //Assignment:10   check it out...

        String line1 = "Nah nah nah nah nah nah nah nah nah yeah";
        String line2 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";
        String line3 = "Nah nah nah nah nah nah, nah nah nah, hey Jude";

        System.out.println("Assignment: 10 -" + line1.equals(line2));
        System.out.println("Assignment: 10 -" + line2.equals(line3));


        //Final Assignment 11:
        /*
     1.To review, let’s try building some of the bank account functionality we talked about throughout the lesson.
     First, create a new double variable called updatedBalance, and store balance with amountToWithdraw
     subtracted from it.

    2.Now, you’ve decided to split your balance evenly 3 ways and give it to your three best friends.
    Create a double variable called amountForEachFriend that holds your updated balance divided by 3.

    3.Your each want to buy a concert ticket with the money you’ve given them. The tickets cost 250!
    Create a boolean called canPurchaseTicket and set it equal to whether or not amountForEachFriend
    * is at least enough to purchase a concert ticket.
    Then, use System.out.println() to print canPurchaseTicket.

     4.How much money did you give your friends, anyway?
     Use + and System.out.println() to print out:

     I gave each friend <amountForEachFriend>...
     with the value of amountForEachFriend where <amountForEachFriend> is.
    */
        double balance = 1000.75;
        double amountToWithdraw = 250;
        double updatedBalance = balance - amountToWithdraw; //1
        double amountForEachFriend = updatedBalance/3;      //2
        boolean canPurchaseTicket = amountForEachFriend >= 250; //3
        System.out.println("Assignment: 11 -" + canPurchaseTicket);//3

        System.out.println("I gave each friend " + amountForEachFriend + "...");//4

    }
}
