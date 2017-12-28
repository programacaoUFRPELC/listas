
public class Subtracao implements OperacaoMatematica
{
	
	public int Calcula(int numero1, int numero2)
	{
		if(numero1 > numero2)
		{
			return numero1-numero2;
		}
		else
		{
			return numero2-numero1;
		}
	}
}
