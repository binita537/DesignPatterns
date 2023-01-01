package PrototypeVehicle;


//https://www.youtube.com/watch?v=MYe5NSmFU_c&t=117s
//https://www.youtube.com/watch?v=DcFhITC9v0E
public class Client {

   public static void main(String[] args) throws CloneNotSupportedException
   {

       Vehicle vehicle1=new Vehicle();
       vehicle1.insertData();

       System.out.println(vehicle1);

       System.out.println("-------------------------------------------------");
       Vehicle vehicle2=vehicle1.clone();
       vehicle2.getVehicleList().remove(0);

       System.out.println(vehicle2);


       //TO check if two object are different
       System.out.println("vehicle1"+vehicle1);
       System.out.println("vehicle2"+vehicle2);


      // System.out.println(vehicle1==vehicle2);

   }

}
