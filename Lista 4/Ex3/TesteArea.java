
public class TesteArea {

	public static void main(String[] args) 
	{
		FormaGeometrica figura1, figura2;
		FormaGeometrica figura3;
		
		figura1 = new Circulo(3);
		figura2 = new Circulo(4);
		figura3 = new Quadrado(3);
		
		System.out.println("Área da Figura1: "+figura1.area());
		System.out.println("Comprimento da Figura1: "+figura1.comprimento());
		System.out.println("Área da Figura2: "+figura2.area());
		System.out.println("Comprimento da Figura2: "+figura2.comprimento());
		System.out.println("Área da Figura3: "+figura3.area());
		System.out.println("Comprimento da Figura3: "+figura3.comprimento());
	}

}
