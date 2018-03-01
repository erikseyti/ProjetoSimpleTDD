package teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import modelo.FizzBuzz;



public class FizzBuzzTeste {

	@Test
	public void testeNumeroNaoDivisivelPor3Nem5() 
	{
		FizzBuzz fizzBuzz = new FizzBuzz(1);
		assertEquals("1",fizzBuzz.getValorFizzBuzz());
	}
	
	@Test
	public void testeNumero4NaoDivisivelPor3Nem5() 
	{
		FizzBuzz fizzBuzz = new FizzBuzz(4);
		assertEquals("4",fizzBuzz.getValorFizzBuzz());
	}
	
	@Test
	public void testeNumero3DivisivelPor3() 
	{
		FizzBuzz fizzBuzz = new FizzBuzz(3);
		assertEquals("Fizz",fizzBuzz.getValorFizzBuzz());
	}
	
	@Test
	public void testeNumero5DivisivelPor5() 
	{
		FizzBuzz fizzBuzz = new FizzBuzz(5);
		assertEquals("Buzz",fizzBuzz.getValorFizzBuzz());
	}
	
	@Test
	public void testeNumero15DivisivelPor15() 
	{
		FizzBuzz fizzBuzz = new FizzBuzz(15);
		assertEquals("FizzBuzz",fizzBuzz.getValorFizzBuzz());
	}
	
}
