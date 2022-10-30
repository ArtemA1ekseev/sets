package homework1;

public class ProductAlreadyExistsException extends RuntimeException{

    public ProductAlreadyExistsException() {
    }

    public ProductAlreadyExistsException(String message) {
        super(message);
    }
}
