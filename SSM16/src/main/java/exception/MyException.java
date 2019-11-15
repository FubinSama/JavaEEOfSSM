package exception;

public class MyException extends Exception {
    private static final long serialVersionUID = -6672702507525718955L;

    public MyException(){
        super();
    }

    public MyException(String message) {
        super(message);
    }
}
