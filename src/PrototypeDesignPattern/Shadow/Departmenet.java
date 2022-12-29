package PrototypeDesignPattern.Shadow;

public class Departmenet implements Cloneable {
    public Employee employee;
    public int Id;
    public String location;

    public Departmenet(Employee employee, int id, String location) {
        this.employee = employee;
        Id = id;
        this.location = location;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Departmenet{" + "employee=" + employee + ", Id=" + Id + ", location='" + location + '\'' + '}';
    }


}
