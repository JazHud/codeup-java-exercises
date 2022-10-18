package com.codeup.java;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee();// a constructor is a method
        /// employee1,2 & 3, are new reference variables linked to a new object aka new Employee()
        employee1.name = "Pablo"; //<-- instance of the employee class
        System.out.println(employee1.displayEmployeeInfo()); //<--static property of class
        Employee employee2 = new Employee();
        employee2.name = "Escobar";//<-- instance variable
        System.out.println(employee2.displayEmployeeInfo());//<--static property of class
        Employee employee3= new Employee();
        employee3.name = "Checo";//<-- instance variable
        System.out.println(employee3.displayEmployeeInfo());//<--static property of class
    }
}
