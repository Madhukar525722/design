package designPatterns.creationalPatterns.singletonPattern;

public class SyncLazyDBconnection {
    private static SyncLazyDBconnection connectionObject;

    private SyncLazyDBconnection(){}

    public static SyncLazyDBconnection getInstance(){
        if(connectionObject == null) {
            connectionObject = new SyncLazyDBconnection();
        }
        return connectionObject;
    }

    public void verifyConnection() {
        if(connectionObject!=null) {
            System.out.println("Synchronized Connection established.");
        }
        else{
            System.out.println("Synchronized Connection in progress.......");
        }
    }
}
