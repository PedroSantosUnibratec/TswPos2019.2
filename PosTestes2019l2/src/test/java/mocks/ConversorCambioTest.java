package mocks;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ConversorCambioTest {
	
	private static IConversorCambio cambio;
	
	@BeforeClass
	public static void setUp() {
		cambio = new ConversorCambio();
	}
	
	@Test
	public void testToDollar_5Reais_para_1Dolar() {
		// Arrange
		// US$ 1 = R$ 5,00
		Double reais = 5.0;
		Double resultadoEmDolares =1.0;
		
		// Act
		Double dolares = cambio.toDollar(reais);
		
		// Assert
		assertEquals(resultadoEmDolares, dolares);
	}
	
	@Test
	public void testToDollar_10Reais_para_2Dolares() {
		// Arrange	-	US$ 1 = R$ 5,00
		Double reais = 10.0;
		Double resultadoEmDolares =2.0;
		
		// Act
		Double dolares = cambio.toDollar(reais);
		
		// Assert
		assertEquals(resultadoEmDolares, dolares);
	}

	@Test
	public void testToReal_1Dolar_para_5Reais() {
		// Arrange	-	US$ 1 = R$ 5,00
		Double dolar = 1.0;
		Double resultadoEmReais = 5.0;
		
		// Act
		Double reais = cambio.toReal(dolar);
		
		// Assert
		assertEquals(resultadoEmReais, reais);
	}
	
	@Test
	public void testToReal_2Dolares_para_10Reais() {
		// Arrange	-	US$ 1 = R$ 5,00
		Double dolar = 2.0;
		Double resultadoEmReais = 10.0;
		
		// Act
		Double reais = cambio.toReal(dolar);
		
		// Assert
		assertEquals(resultadoEmReais, reais);
	}

}
