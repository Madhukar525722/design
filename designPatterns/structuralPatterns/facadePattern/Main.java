package designPatterns.structuralPatterns.facadePattern;

public class Main {
    public static void main(String[] args) {
        EmployeeFacade employee = new EmployeeFacade();
        employee.insert();
        employee.getEmployeeDetails(2);
    }
}
