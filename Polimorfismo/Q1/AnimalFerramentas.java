
package questao1;


import java.util.ArrayList;
import java.util.List;

public class AnimalFerramentas implements Ferramentas {

	
	
	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especieFiltrar) {
		List<Animal> l = new ArrayList<Animal>();
		
	//	Animal[] animais = new Animal[100];
		
	//	List<Animal> tmp = Arrays.asList(completo);
	//	System.out.println(tmp);
		for (int i = 0; i < completo.length; i++){
			if ((completo[i].getNomeEspecie()).equals(especieFiltrar)){
				l.add(completo[i]);
				//animais[k] = completo[i];
				//System.out.println(l.get(i).getNomeAnimal());
				
			}
		}
		
		/*
		for (int j = 0; j < animais.length - 1; j++) {
			System.out.println(animais[j].getNomeAnimal());
		}
		*/
		if(l.isEmpty()){
			Animal[] outros = new Animal[0];
			return outros;
		}
		
		Animal[] animais= new Animal[l.size()];
		for (int j = 0; j < l.size(); j++) {
			animais[j] = l.get(j);
		}
		
		return animais;
	}

	@Override
	public String[] classificaEspecies(Animal[] completo) {
		
		List<String> l = new ArrayList<String>();
		int size = completo.length;
		int ind = 0;
		String tmp = "";
		boolean flag = false;
		if (size > 0){
			
			for (int i = 0; i < size; i++){
				tmp = completo[i].getNomeEspecie();
			
				if(!l.contains(tmp)) {
					l.add(tmp);
				}
			}
		}	
		String[] listaEspecies = new String[l.size()];
		for (int j = 0; j < l.size(); j++) {
			listaEspecies[j] = l.get(j);
		}
		
		return listaEspecies;
	}


}
