public class E_Class_Constructor {
    //created a constructor:
    public E_Class_Constructor() {
        System.out.println("I execute first");
    }

    //This is a method below or function we can say:
    void sum(int a,int b){
        System.out.println(a+b);
    }

    // main method is where we create instances!
    public static void main(String[] args) {

        // create the instance below:
        //We create an instance so we move from main() to E_Class_Constructor().
        E_Class_Constructor etc = new E_Class_Constructor(); //This will execute first because i'm calling it first.

        etc.sum(3,5);//Then i am calling sum method.

        //print the instance below
        System.out.println(etc);

        //E_Class_Constructor@6acbcfc0
        //The first part, store, refers to the class, and the second part (@6acbcfc0) refers to the
        // instance's location in the computer's memory.
    }

}


