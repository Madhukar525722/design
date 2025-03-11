package designPatterns.proxyPattern;

public interface EmployeeTable {
    public void create(String client, String data) throws Exception;
    public void delete(String client, int id) throws Exception;
    public String get(String client, int id) throws Exception;
}