/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.inf.ufg.conversorRomanos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author João Pedro Salgado
 */
public class ConversorRomano {
    
Map<String, Integer> numerosRomanos = new HashMap<String, Integer>();
ArrayList<String> listaNumerosRomanos = new ArrayList<String>();	

public void ListaRomanos() {
		numerosRomanos.put(("M").toLowerCase(), 1000);
		numerosRomanos.put(("D").toLowerCase(), 500);
		numerosRomanos.put(("C").toLowerCase(), 100);
		numerosRomanos.put(("L").toLowerCase(), 50);
		numerosRomanos.put(("X").toLowerCase(), 10);
		numerosRomanos.put(("V").toLowerCase(), 5);
		numerosRomanos.put(("I").toLowerCase(), 1);
	}

	public int conveterRomano(String Numeroromano) {
		char vetorRomano[] = Numeroromano.toCharArray();
		int result = 0;
		
		for(int i = 0; i < Numeroromano.length(); i++) {
			if(numerosRomanos.containsKey(Character.toString(vetorRomano[i]).toLowerCase())) {
				result += numerosRomanos.get(Character.toString(vetorRomano[i]).toLowerCase());
			}
		}
		
		return result;
	}
	
	public ConversorRomano() {
		ListaRomanos();
	}
	

}
        
	