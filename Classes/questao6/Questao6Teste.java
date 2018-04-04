package classes.questao6;

public class Questao6Teste {

	public static void main(String[] args) {
		VetorOrdenado v1 = new VetorOrdenado(4);
		VetorOrdenado v2 = new VetorOrdenado(12);
		
		
	
		v1.insert("Ana");
		v1.insert("Maria");
		v1.insert("Jennifer");
		v1.insert("Bianca");
		v1.insert("Carlos");
	
		
		
		v2.insert("Viviane");
		v2.insert("Analice");
		v2.insert("Mariana");
		v2.insert("Ziraldo");
		v2.insert("José");
	
		
		for (int i = 0; i < v1.getIndex(); i++) {
			System.out.println("V1: " + v1.get(i));
		}
		
		VetorOrdenado v3 = v1.merge(v2);
		
		for (int j = 0; j < v2.getIndex(); j++) {
			System.out.println("V2: " + v2.get(j));
		}
		
		for (int j = 0; j < v3.getIndex(); j++) {
			System.out.println("V3: " + v3.get(j));
		}
	}

}
