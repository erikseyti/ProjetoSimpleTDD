package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelo.FraseColuna;

public class FraseColunaTeste {

	@Test
	public void Coluna1Letra() 
	{
		String frase = "1";
		FraseColuna fraseColuna = new FraseColuna(frase);
		assertEquals(1, FraseColuna.QuebraLinha(frase));
	}
	
	@Test
	public void capturarCaracteres() {
		String frase = "caracter";
		FraseColuna fraseColuna = new FraseColuna(frase);
		assertEquals(8, FraseColuna.QuebraLinha(frase));
			
	}
	
	@Test
	public void pularColunas() {
		int coluna = 20;
		String frase = "Um pequeno jabuti xereta";
		FraseColuna fraseCOluna = new FraseColuna(frase);
		assertEquals(20, FraseColuna.QuebraLinha(frase));
		
	}
	
	
}
