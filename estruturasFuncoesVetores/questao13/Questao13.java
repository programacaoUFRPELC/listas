package estruturasFuncoesVetores.questao13;

public class Questao13 {

	public static void main(String[] args) {
		String[] v1 = {"Ana", "Cristina", "Daniela"};
		
		String[] v2 = { "Andrea", "Bianca", "Bob", "Erica", "Fabiana", "Henrique"};

		String[] r = mergeVetores(v1, v2);
		
		for (int i = 0; i < r.length; i++) {
			System.out.println(r[i]);
		}
	}
	
	public static String[] mergeVetores(String[] v1, String[] v2) {
		int s1 = v1.length;
		int s2 = v2.length;
		int i, j, k, t1, t2;
		i = j = k = t1 = t2 = 0;
		int size = s1 + s2;
		String[] resultado = new String[size];
		
		while (t1 < s1 && t2 < s2) {
			if(v1[t1].compareToIgnoreCase(v2[t2]) <= 0) {
				resultado[k] = v1[t1];
				t1++;
				k++;
			}
			
			else {
				resultado[k] = v2[t2];
				t2++;
				k++;
			}
		}
		
		while(t1 < s1) {
			resultado[k] = v1[t1];
			k++;
			s1++;
		}
		
		while (t2 < s2) {
			resultado[k] = v2[t2];
			k++;
			t2++;
		}
	
	
		return resultado;
		}

}
