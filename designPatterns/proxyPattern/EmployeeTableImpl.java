package designPatterns.proxyPattern;

public class EmployeeTableImpl implements EmployeeTable {
    @Override
    public void create(String client, String data) throws Exception{
        System.out.println("Creating the table");
    }

    @Override
    public void delete(String client, int id) throws Exception {
        System.out.println("Deleting the table");
    }

    @Override
    public String get(String client, int id) throws Exception{
        System.out.println("Your table is THE table");
        return client + id;
    }
}
