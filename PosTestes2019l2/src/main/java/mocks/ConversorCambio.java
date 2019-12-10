package mocks;

public class ConversorCambio implements IConversorCambio {
	
	/**
	 * US$ 1 = R$ 5,00
	 */
	public Double toDollar(Double pReais) {
		return Double.valueOf(pReais/5);
	}
	
	public Double toReal(Double pDollars) {
		return Double.valueOf(pDollars * 5);
	}
	
}