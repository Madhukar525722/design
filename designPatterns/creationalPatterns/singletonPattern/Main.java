package designPatterns.creationalPatterns.singletonPattern;

public class Main {
    public static void main(String[] args){
        EagerDBconnection connection1 = EagerDBconnection.getInstance();
        connection1.verifyConnection();
        LazyDBconnection connection2 = LazyDBconnection.getInstance();
        connection2.verifyConnection();
        SyncLazyDBconnection connection3 = SyncLazyDBconnection.getInstance();
        connection3.verifyConnection();
        DoubleLockDBconnection connection4 = DoubleLockDBconnection.getInstance();
        connection4.verifyConnection();
    } 
}
