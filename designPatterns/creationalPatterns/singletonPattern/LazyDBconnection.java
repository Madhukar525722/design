package designPatterns.creationalPatterns.singletonPattern;

public class LazyDBconnection {
    private static LazyDBconnection connectionObject;

    private LazyDBconnection(){}

    public static LazyDBconnection getInstance(){
        if(connectionObject == null) {
            connectionObject = new LazyDBconnection();
        }
        return connectionObject;
    }

    public void verifyConnection() {
        if(connectionObject!=null) {
            System.out.println("Lazy Connection established.");
        }
        else{
            System.out.println("Lazy Connection in progress.......");
        }
    }
}
