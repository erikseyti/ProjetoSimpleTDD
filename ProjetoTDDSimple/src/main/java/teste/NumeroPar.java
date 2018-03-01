package teste;

import java.util.ArrayList;
import java.util.List;

public class NumeroPar {


	static List<Integer> numeros = new ArrayList<Integer>();
	private int contador;
	
	public NumeroPar(List<Integer> numeros) {
		this.numeros = numeros;
	}


	public static String numerosPares() {
		int contador = 0;
		
		for (int valor : numeros) {
			if (valor %2 == 0) 
			{
				contador = contador +1;
				
			}
		}
		
		return contador+" valores pares";
		
	}

}
