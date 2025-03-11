package designPatterns.chainPattern;

public class LoggerError extends Logger {
    public LoggerError(Logger nextLogger){
        super(nextLogger);
    }

    @Override
    public void log(int logLevel, String message){
        System.out.println("ERROR was called");
        if(logLevel==ERROR){
            System.out.println("ERROR: "+ message );
        }
        else{
            super.log(logLevel, message);
        }
    }
}
