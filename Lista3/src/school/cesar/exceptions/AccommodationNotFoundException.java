package school.cesar.exceptions;

public class AccommodationNotFoundException extends Exception {

	private static final long serialVersionUID = 7241309286315587880L;
	
	public AccommodationNotFoundException() {
		super("Hospedagem não encontrada.");
	}

}
