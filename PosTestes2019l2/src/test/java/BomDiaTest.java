import static org.junit.Assert.*;

import org.junit.Test;

public class BomDiaTest {

	@Test
	public void testGetBomDia() {
		BomDia bomdia = new BomDia();
		
		String bd = bomdia.getBomDia();
		
		assertEquals("Bom Dia!", bd);
	}

}
