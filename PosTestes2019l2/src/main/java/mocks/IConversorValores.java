package mocks;

public interface IConversorValores {
	
	// Sem Mock
	public Double toDouble(String pString);
	
	// Sem Mock
	public String toString(Double pDouble);
	
	// Com Mock
	public String toDollars(String pReais);
	
	// Com Mock
	public String toReais(	String pDollars);
	
}