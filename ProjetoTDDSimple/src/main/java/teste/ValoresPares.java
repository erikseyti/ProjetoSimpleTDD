package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelo.NumeroPar;

import java.util.ArrayList;
import java.util.List;

public class ValoresPares {

	@Test
	public void Numero1NaoPar() 
	{

		List<Integer> numero = new ArrayList<Integer>();
		numero.add(1);
		NumeroPar numeros = new NumeroPar(numero);
		assertEquals("0 valores pares", NumeroPar.numerosPares());
	}
	
	@Test
	public void Numero2Par() 
	{
		List<Integer> numero = new ArrayList<Integer>();
		numero.add(2);
		NumeroPar numeros = new NumeroPar(numero);
		assertEquals("1 valores pares", NumeroPar.numerosPares());
	}
	
	@Test
	public void Numero3Impar() 
	{
		List<Integer> numero = new ArrayList<Integer>();
		numero.add(3);
		NumeroPar numeros = new NumeroPar(numero);
		assertEquals("0 valores pares", NumeroPar.numerosPares());
	}
	
	@Test
	public void Numeros1e2Grupo() 
	{
		List<Integer> numero = new ArrayList<Integer>();
		numero.add(1);
		numero.add(2);
		NumeroPar numeros = new NumeroPar(numero);
		assertEquals("1 valores pares", NumeroPar.numerosPares());
	}
	
	@Test
	public void Numeros1e2e3e5e4e7e8Grupo() 
	{
		List<Integer> numero = new ArrayList<Integer>();
		numero.add(1);
		numero.add(2);
		numero.add(3);
		numero.add(5);
		numero.add(4);
		numero.add(7);
		numero.add(8);
		NumeroPar numeros = new NumeroPar(numero);
		assertEquals("3 valores pares", NumeroPar.numerosPares());
	}
	
}
