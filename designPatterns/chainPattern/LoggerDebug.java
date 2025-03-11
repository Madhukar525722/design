package designPatterns.chainPattern;

public class LoggerDebug extends Logger {
    public LoggerDebug(Logger nextLogger){
        super(nextLogger);
    }
    @Override
    public void log(int logLevel, String message){
        System.out.println("DEBUG was called");
        if(logLevel==DEBUG){
            System.out.println("DEBUG: " + message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
