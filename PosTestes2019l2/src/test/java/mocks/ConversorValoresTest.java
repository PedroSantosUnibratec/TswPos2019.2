package mocks;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class ConversorValoresTest {
	
	private static IConversorValores conversor;
	
	@BeforeClass
	public static void setUp() {
		conversor = new ConversorValores();
	}

	@Test
	public void testToDouble_RS5ponto432virgula10_para_5432ponto1() {
		// Arrange - R$ 5.432,10 em 5432.1
		String valorReaisLegivel = "R$ 5.432,10";
		Double resultadoEsperado = 5432.1;
		
		// Act
		Double valorDouble = conversor.toDouble(valorReaisLegivel);
		
		// Assert
		assertEquals(resultadoEsperado, valorDouble);
	}
	
	@Test
	public void testToDouble_RS1ponto234virgula56_para_1234ponto56() {
		// Arrange - R$ 1.234,56 em 1234.56
		String valorReaisLegivel = "R$ 1.234,56";
		Double resultadoEsperado = 1234.56;
		
		// Act
		Double valorDouble = conversor.toDouble(valorReaisLegivel);
		
		// Assert
		assertEquals(resultadoEsperado, valorDouble);
	}

	@Test
	public void testToStringDouble() {
		fail("Not yet implemented");
	}

	@Test
	public void testToDollars() {
		fail("Not yet implemented");
	}

	@Test
	public void testToReais() {
		fail("Not yet implemented");
	}

}
