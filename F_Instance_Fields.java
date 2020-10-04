public class F_Instance_Fields {
    //This is below are called instance variable or instance field.
    String color,color1;

   //Constructor below:
   public F_Instance_Fields(){
        color = "blue";
        color1 = "purple";
        System.out.println("Your car is " + color + " and "+ color1 + " in color");
    }

    public static void main(String[] args) {
        F_Instance_Fields car = new F_Instance_Fields();
        System.out.println(car);  //F_Instance_Fields@3d494fbf
        //Here F_Instance_Fields is the class name and @3d494fbf is the memory location which we saw
        //in the previous exercise which is E_Class_Constructor.java.
    }
}
