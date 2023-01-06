package PrototypeDesignPattern.Deep;

import java.util.ArrayList;
import java.util.List;

public class Vehicle implements Cloneable {

    private List<String> vehicleList;

    public Vehicle() {
        this.vehicleList = new ArrayList<>();

    }

    public Vehicle(List<String> vList) {
        this.vehicleList = vList;

    }


    public void insertData()
    {
        vehicleList.add("Honda");
        vehicleList.add("Audi");
        vehicleList.add("Hyundai");
        vehicleList.add("Maruthi");
        vehicleList.add("Renault");
    }

    public List<String> getVehicleList() {
        return this.vehicleList;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleList=" + vehicleList +
                '}';
    }

    @Override
    protected Vehicle clone() throws CloneNotSupportedException {
       List<String> tempVehicle=new ArrayList<>();
       for (String s:this.getVehicleList())
       {
           tempVehicle.add(s);
       }
       return new Vehicle(tempVehicle);
    }
}
