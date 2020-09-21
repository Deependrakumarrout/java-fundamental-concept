public class B_java_variables { //Class name
    public static void main(String[] args) {  //Program start from main
        String name = "James Gosling";  //data type string
        int yearCreated = 1995;         //data type integer
        System.out.println(name);       //output
        System.out.println(yearCreated); //output of yearCreated

        //Integer part ->

        int count = 4;
        System.out.println(count);

        //Double part ->
        double tow = 81.95;
        System.out.println(tow);

        //Boolean ->
        boolean intCanHoldDecimal = false;
        System.out.println(intCanHoldDecimal);


        //Char ->
        char myGradeInJava = 'A';
        System.out.println(myGradeInJava);


        //String ->
        String objectLyrics = "Yesterday, all my troubles seemed so far away";
        System.out.println(objectLyrics);


        //Converted from double to int.
        double myDouble = 9.78;
        int $myInt = (int) myDouble;
        System.out.println($myInt);

        String Dname = "Deependra";
        int age = 20;
        double desiredSalary = 200000;
        char gender = 'm';
        boolean lookingForJob = false;
        System.out.println(Dname.equals("Deependra")); //equals() method to know about two string either its equal or not.
    }
}
