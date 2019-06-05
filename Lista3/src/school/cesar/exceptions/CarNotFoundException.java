package school.cesar.exceptions;

public class CarNotFoundException extends Exception{

	
	private static final long serialVersionUID = 6648440999501870317L;
	
	public CarNotFoundException() {
		super("Carro não encontrado.");
	}

}
