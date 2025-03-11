package designPatterns.structuralPatterns.facadePattern;

public class EmployeeFacade {
    EmployeeDAO obj;

    public EmployeeFacade(){
        obj = new EmployeeDAO();
    }

    public void insert(){
        obj.insert();
    }

    public Employee getEmployeeDetails (int employeeId){
        return obj.getEmployeeDetails(employeeId);
    }
}
