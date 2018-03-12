
package questao1;

import java.util.ArrayList;
import java.util.List;

public class Questao1Teste {

	public static void main(String[] args) {
		Animal a1 = new Cachorro("Rex");
		Animal a2 = new Cachorro("Pluto");
		Animal a3 = new Gato("Felix");
		Animal a4 = new Gato("Jango");
		Animal a5 = new Cavalo("Seabiscuit");
		Animal a6 = new Papagaio("Ze Carioca");
		Animal a7 = new Papagaio("Vitrola");
		
		
		Animal[] animais = {a1, a2, a3, a4, a5, a6, a7};
		
		Resultado[] total;
		AnimalFerramentas animalFerramentas = new AnimalFerramentas();
		total = metodo(animais, animalFerramentas);
	
		
		for (int i = 0; i < total.length; i++) {
			System.out.println("\nEspecie: " + total[i].getNomeEspecie() + "\nQuantidade: " + total[i].getQuantidade());
		}
		
	}

	public static Resultado[] metodo(Animal[] animais, Ferramentas f) {
		
		
		List<Resultado> lr = new ArrayList<Resultado>();
		
		Animal [] e = new Animal[100];
		
		String[] especies = f.classificaEspecies(animais);
		//System.out.println("Especies 0:" + especies[0]);
		for (int i = 0; i < especies.length; i++) {
			e = f.filtraEspecie(animais, especies[i]);
		//	System.out.println("Tamanho de especies: " + e.length);
			int num = e.length;
			Resultado temp = new Resultado(especies[i], num);
			lr.add(temp);
			//r[i] = temp;
		}
		
		Resultado [] r = new Resultado[lr.size()];
		for (int k = 0; k < lr.size(); k++) {
			r[k] = lr.get(k);
		}
		return r;
		
	}
}
