public class Employee { //<--defining class of the default constructor <-- which is automatically created.

    public String name;// <--Create an Employee class. The employee class should have a name instance variable,
    public static String company = "Veridian Dynamics"; //default value::: can put final after static to not be able to reassign the var in the employee.
    public String displayEmployeeInfo(){
        return name + " works at " + company;
    }
    public Employee(){ //<-- constructor
        System.out.println("This is a new Employee");
    }
}
