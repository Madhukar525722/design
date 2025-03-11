package designPatterns.chainPattern;

public class LoggerInfo extends Logger {
    public LoggerInfo(Logger nextLogger){
        super(nextLogger);
    }
    @Override
    public void log(int logLevel, String message){
        System.out.println("INFO was called");
        if(logLevel==INFO){
            System.out.println("INFO: "+ message);
        }
        else{
            super.log(logLevel, message);
        }
    }
}
