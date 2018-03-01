package modelo;

public class FizzBuzz {
	
	private int numero;
	
	public FizzBuzz (int numero) 
	{
		this.numero = numero;
	}

	public String getValorFizzBuzz() {
		// TODO Auto-generated method stub
		if (numero % 3 == 0 && numero % 5 == 0) 
		{
			return "FizzBuzz";
		}
		
		if (numero % 3 == 0) 
		{
			return "Fizz";
		}
		if (numero % 5 == 0) 
		{
			return "Buzz";
		}
		
		return Integer.toString(numero);
	}
	


}
