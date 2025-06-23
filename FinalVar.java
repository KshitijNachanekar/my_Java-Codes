class Vehicle{
    final void run(){
        System.out.println("Vehicle is running");
    }
}
class Car extends Vehicle{
    @Override
    void run(){
         System.out.println("Car is running");//This will not
    }
}
public class FinalVar {
   public static void main(String[] args) { 
     Vehicle v1 = new Vehicle();
     v1.run();
    Car c1 = new Car();
    c1.run();
 }
}