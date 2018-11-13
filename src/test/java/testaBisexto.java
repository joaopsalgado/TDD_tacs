/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import br.inf.ufg.exerciciotdd.AnoBisexto;
import static org.junit.Assert.assertEquals;;
import org.junit.Test;

/**
 *
 * @author João Pedro Salgado
 */
public class testaBisexto {

    public testaBisexto() {

    }

    @Test
    public void testaAno() {
        System.out.println("Testando se o ano e bisexto");
        int AnoTeste = 2000;

        String respostaEsperada = "ANO BISEXTO";
        AnoBisexto anobi = new AnoBisexto();
        String respostaReal = anobi.VerificaAno(AnoTeste);

        assertEquals(respostaEsperada, respostaReal);

    }
        @Test 
        public void testaAnoAlternativo() {
        System.out.println("Testando se o ano e bisexto");
        int AnoTeste = 2001;

        String respostaEsperada = "ANO BISEXTO";
        AnoBisexto anobi = new AnoBisexto();
        String respostaReal = anobi.VerificaAno(AnoTeste);

        assertEquals(respostaEsperada, respostaReal);

    }
        
        @Test 
        public void testaAnoAlternativo2() {
        System.out.println("Testando se o ano e bisexto");
        int AnoTeste = 2001;

        String respostaEsperada = "ANO NAO BISEXTO";
        AnoBisexto anobi = new AnoBisexto();
        String respostaReal = anobi.VerificaAno(AnoTeste);

        assertEquals(respostaEsperada, respostaReal);

    }

}
