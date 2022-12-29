package PrototypeDesignPattern.Shadow;

public class Client {

    public static void main(String[] args)  throws CloneNotSupportedException
    {
        Employee employee=new Employee("Employee1",20000);
        Departmenet departmenet1=new Departmenet(employee,100,"Benglore");

        System.out.println(departmenet1);

        System.out.println("--------------------------------");

        Departmenet departmenet2 = (Departmenet) departmenet1.clone();
        departmenet2.employee.name="Employee2";
        departmenet2.employee.salary=40000;
        System.out.println(departmenet2);

        System.out.println("--------------------------------");




    }
}
