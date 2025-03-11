package designPatterns.chainPattern;

public class Main {
    public static void main(String args[]){
        Logger logObject = new LoggerInfo(new LoggerDebug(new LoggerError(null)));
        // Here Info gets initalized and passed its params to parent using super, which becomes next
        // object to look at and using super.log, log function of parent is called if it goes for else
        // which calls the nextLogger.log

        logObject.log(Logger.ERROR, "This is the error message");
        logObject.log(Logger.DEBUG, "debugging");
        logObject.log(Logger.INFO, "info messages");
    }
}
