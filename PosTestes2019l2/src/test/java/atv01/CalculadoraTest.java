package atv01;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculadoraTest {
	
	
	@Test
	public void testDividir10Por1() throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido {
		// Arrange
		String dividendo	= "10";
		String divisor		= "1";
		ICalculadora calc	= new Calculadora();
		
		// Act
		double resultado = calc.dividir(dividendo, divisor);
		
		// Assert
		assertEquals(10, resultado, 0.001);
	}
	
	@Test
	public void testDividir1Por10() throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido {
		// Arrange
		String dividendo	= "1";
		String divisor		= "10";
		ICalculadora calc	= new Calculadora();
		
		// Act
		double resultado = calc.dividir(dividendo, divisor);
		
		// Assert
		assertEquals(0.1, resultado, 0.001);
	}
	
	@Test
	public void testDividir2Ponto57Por5Ponto29() throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido {
		// Arrange
		String dividendo	= "2.57";
		String divisor		= "5.29";
		ICalculadora calc	= new Calculadora();
		
		// Act
		double resultado = calc.dividir(dividendo, divisor);
		
		// Assert
		assertEquals(0.485, resultado, 0.001);
	}
	
	@Test
	public void testDividir0Por10() throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido {
		// Arrange
		String dividendo	= "0";
		String divisor		= "10";
		ICalculadora calc	= new Calculadora();
		
		// Act
		double resultado = calc.dividir(dividendo, divisor);
		
		// Assert
		assertEquals(0, resultado, 0.001);
	}
	
	@Test(expected=ExcecaoDivisorIgualZero.class)
	public void testDividir10Por0() throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido {
		// Arrange
		String dividendo	= "10";
		String divisor		= "0";
		ICalculadora calc	= new Calculadora();
		
		// Act
		double resultado = calc.dividir(dividendo, divisor);
		
		// Assert
	}
	
	@Test(expected=ExcecaoFormatoNumericoInvalido.class)
	public void testDividir10PorZero() throws ExcecaoDivisorIgualZero, ExcecaoFormatoNumericoInvalido {
		// Arrange
		String dividendo	= "10";
		String divisor		= "Zero";
		ICalculadora calc	= new Calculadora();
		
		// Act
		double resultado = calc.dividir(dividendo, divisor);
		
		// Assert
	}

}
