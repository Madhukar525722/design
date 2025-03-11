package designPatterns.proxyPattern;

public class Main {
    public static void main(String args[]){
        try{
            EmployeeTable table = new EmployeeTableProxy();
            table.create("ADMIN", "Hi there");
            System.out.println("Operation successful");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
