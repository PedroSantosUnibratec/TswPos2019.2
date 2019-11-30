package atv01;

public interface ICalculadora {
	
	public double dividir(String pDividendo, String pDivisor) throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido;
	
}
