package atv01;

public class Calculadora implements ICalculadora {
	
	public double dividir(String pDividendo, String pDivisor) throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido {
		double resultado = 0;
		
		try {
			double dividendo	= Double.parseDouble(pDividendo);
			double divisor		= Double.parseDouble(pDivisor);
			
			if ( Double.parseDouble(pDivisor) != 0.0 ) {
				resultado =		dividendo	/	divisor;
			} else {
				throw new ExcecaoDivisorIgualZero();
			}
		} catch ( NumberFormatException nfe ) {
			throw new ExcecaoFormatoNumericoInvalido();
		}
		
		
		return resultado;
	}
	
}
