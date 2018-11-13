
import br.inf.ufg.conversorRomanos.ConversorRomano;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author João Pedro Salgado
 */
public class testaRomano {
    
    
	@Test
	void Test() {
		converterRomano();
	}

	public void converterRomano() {
		String numeroRomano = "MMDLIX";
		
		ConversorRomano convRomano = new ConversorRomano();
		
		int resposta = convRomano.conveterRomano(numeroRomano);
		
		assertEquals(2500, resposta);
	}

}
    
    

