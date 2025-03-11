package designPatterns.creationalPatterns.singletonPattern;

public class DoubleLockDBconnection {
    private static DoubleLockDBconnection connectionObject;

    private DoubleLockDBconnection(){}

    public static DoubleLockDBconnection getInstance(){
        if(connectionObject == null) {
            synchronized (DoubleLockDBconnection.class){
                if(connectionObject==null){
                    connectionObject = new DoubleLockDBconnection();
                }
            }
        }
        return connectionObject;
    }

    public void verifyConnection() {
        if(connectionObject!=null) {
            System.out.println("Double Lock Connection established.");
        }
        else{
            System.out.println("Double Lock Connection in progress.......");
        }
    }
}
