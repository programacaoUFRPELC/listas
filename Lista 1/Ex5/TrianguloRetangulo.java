

public class TrianguloRetangulo 
{
	private double base;
	private double altura;
	private double hipotenusa;
	
	public TrianguloRetangulo(){
		this.base = 0;
		this.altura = 0;
		this.hipotenusa = 0;
	}
	
	public TrianguloRetangulo(double altura, double base, double hipotenusa)
	{		
		this.altura = altura;
		this.base = base;
		this.hipotenusa = hipotenusa;
	}

	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getHipotenusa() {
		return hipotenusa;
	}

	public void setHipotenusa(double hipotenusa) {
		this.hipotenusa = hipotenusa;
	}

	public double area()
	{
		double area = (this.base * this.altura)/2;
		return area;
	}
	
	
/*	A resolução calcula o perímetro do triângule e considera que o comprimento da hipotenusa já é conhecido.  Se esse
	não for o caso (e soubermos apenas o comprimento dos catetos, a forma de calcular a hipotenusa
	segue abaixo:
		double hipot = (base*base)+(altura*altura);
		this.hipotenusa = Math.sqrt(hipot);
		double comprimento = base+altura+hipotenusa;
	*/

	public double comprimento()
	{
		double comprimento = this.getAltura() + this.getBase() + this.getHipotenusa();
		
		return comprimento;
	}
	
}
