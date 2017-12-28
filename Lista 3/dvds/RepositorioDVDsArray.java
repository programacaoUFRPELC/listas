package dvds;

public class RepositorioDVDsArray {
	public static void main(String[] args) {

		Dvd cd1 = new Dvd(1, "Marisa Monte");

		Dvd cd2 = new Dvd(2, "Kurt Vile");

		Dvd cd3 = new Dvd(4, "Maria Rita");

		Dvd cd4 = new Dvd(76, "Rita Lee");

		Dvd[] temp;

		RepositorioDVDArray repositorio = new RepositorioDVDArray(100);

		repositorio.inserir(cd1);
		repositorio.inserir(cd2);
		repositorio.inserir(cd3);
		repositorio.inserir(cd4);

		System.out.println("DVD toString:\n " + cd1);

		System.out.println("Get Codigo: " + cd1.getCodigo());

		System.out.println("Get Descricao: " + cd1);

		System.out.println("Get Codigo: " + cd2);

		System.out.println("Get Descricao: " + cd2);

		System.out.println("Set Descricao: ");
		cd1.setDescricao("Nirvana");
		System.out.println("Get Descricao: " + cd1);

		Dvd mycd = repositorio.procurar(2);
		System.out.println("Procurar: " + mycd);

		mycd = repositorio.procurar(4);
		System.out.println("Procurar: " + mycd);

		System.out.println("Remover");

		repositorio.remover(cd2);

		temp = repositorio.getDvds();

		for (int i = 0; i < repositorio.getIndice(); i++) {
			System.out.print(temp[i].getDescricao() + " ");
		}

		System.out.println("\nRemover");

		repositorio.remover(cd3);

		System.out.println(cd1);
		System.out.println(cd4);
		System.out.println(repositorio);
	}

}
