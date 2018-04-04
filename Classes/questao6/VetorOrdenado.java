package classes.questao6;


import classes.questao5.Vetor;

public class VetorOrdenado  {

	private Vetor vetorO;
	private int index;
	private int size;
	
	public VetorOrdenado(int n) {
		this.vetorO = new Vetor(n);
		this.index = 0;
		this.size = n;
	}
	
	
	public int getSize() {
		return size;
	}


	public void setSize(int size) {
		this.size = size;
	}


	public int getIndex() {
		return index;
	}


	public void setIndex(int index) {
		this.index = index;
	}


	public void insert(String s) {
	
		
		int local = 0;
		
		if (this.index == 0) {
			this.vetorO.insert(s);
			this.index++;
			this.size++;
			
		}
		else {
			Vetor tmp = new Vetor(this.size + 1);
			
			for (int i = 0; i < this.getSize(); i++) {
				if(this.vetorO.get(i) != null && this.vetorO.get(i).compareTo(s) < 0) {
					local++;
				}
			}
			
			for (int j = 0; j < local; j++) {
				tmp.insert(this.vetorO.get(j));
			}
			
			tmp.insert(s);
			
			for (int k = local; k < tmp.getSize(); k++) {
				tmp.insert(this.vetorO.get(k));
			}
			
			this.vetorO = tmp;
			this.index++;
			this.size++;
			
		
		}
		
	}
	
	public String get(int n) {
		String s = null;
		if (n < this.vetorO.size() && this.vetorO.get(n) != null) {
			s = this.vetorO.get(n);
		}
		return s;
}
	
	public VetorOrdenado merge(VetorOrdenado v) {
	
		
	
			int s1 = this.getIndex();
			int s2 = v.getIndex();
			int t1, t2;
			t1 = t2 = 0;
			int s3 = s1 + s2;
			
			VetorOrdenado resultado = new VetorOrdenado(s3);
		
			
			while (t1 < s1 && t2 < s2) {
				
				if(this.vetorO.get(t1).compareTo(v.get(t2)) <= 0) {
				
					resultado.insert(this.get(t1));
					t1++;
					
				}
				
				else {
					resultado.insert(v.get(t2));
					t2++;
					
				}
			}
			
			while(t1 < s1) {
				
				resultado.insert(this.get(t1));
				s1++;
			}
			
			while (t2 < s2) {
				
				resultado.insert(v.get(t2));	
				t2++;
			}
		
		
			return resultado;
			}

	
}
