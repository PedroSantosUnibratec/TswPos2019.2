package mocks;

public class ConversorValores implements IConversorValores {

	public Double toDouble(String pString) {
		pString = pString.substring(3, pString.length());
		pString = pString.replace(".", "");
		pString = pString.replace(",", ".");
		return Double.valueOf(pString);
	}

	public String toString(Double pDouble) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toDollars(String pReais) {
		// TODO Auto-generated method stub
		return null;
	}

	public String toReais(String pDollars) {
		// TODO Auto-generated method stub
		return null;
	}

}
