package designPatterns.creationalPatterns.singletonPattern;

public class EagerDBconnection {
    private static EagerDBconnection connectionObject = new EagerDBconnection();

    private EagerDBconnection(){}

    public static EagerDBconnection getInstance(){
        return connectionObject;
    }

    public void verifyConnection() {
        if(connectionObject!=null) {
            System.out.println("Eager Connection established.");
        }
        else{
            System.out.println("Eager Connection in progress.......");
        }
    }
}
