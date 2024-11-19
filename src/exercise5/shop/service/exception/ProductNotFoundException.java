package exercise5.shop.service.exception;

public class ProductNotFoundException extends Exception{
	private static final long serialVersionUID = -6162667973368277683L;

	public ProductNotFoundException(String msg) {
		super(msg);
	}

	
}
