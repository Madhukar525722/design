//To implement access restriction
package designPatterns.proxyPattern;

public class EmployeeTableProxy implements EmployeeTable {
    EmployeeTable obj;
    public EmployeeTableProxy(){
        obj = new EmployeeTableImpl();
    }
    public void create(String client, String data) throws Exception{
        if(client.equals("ADMIN")){
            obj.create(client, data);
            return;
        }
        throw new Exception("Access denied");
    }
    public void delete(String client, int id) throws Exception {
        if(client.equals("ADMIN")){
            obj.delete(client, id);
            return;
        }
        throw new Exception("Access denied");
    }
    public String get(String client, int id) throws Exception{
        if(client.equals("ADMIN") || client.equals("USER")){
            return obj.get(client, id);
        }
        throw new Exception("Access denied");
    }
}
