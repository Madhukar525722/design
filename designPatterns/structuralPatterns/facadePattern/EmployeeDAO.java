package designPatterns.structuralPatterns.facadePattern;

public class EmployeeDAO {
    public void insert(){

    }

    public void updateEmployeeName(){

    }
    public Employee getEmployeeDetails(String emaidId){
        return new Employee();
    }

    public Employee getEmployeeDetails(int employeeId){
        System.out.println("This is the employeeId " + employeeId);
        return new Employee();
    }
}
