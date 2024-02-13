package MyException;

public class PhoneException extends NumberFormatException {
    public PhoneException(String s) {
        super(s);
    }
}
