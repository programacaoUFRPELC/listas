

import java.util.Scanner;

public class OperaçoesEmpregado {

	public static void main(String[] args) 
	{
		String name,departamento,cargo = "diretoria";
		
		float salarioHora, horasTrabalhadas,horasTrabalhadasExtra,horasTrabalhadasExtraF;
		int resultado;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Digite o Nome do funcionairo");
		name = input.nextLine();
		
		System.out.println("Informe o departamento");
		departamento = input.nextLine();
		
		Empregado funcionario = new Empregado();
		
		System.out.println("Informe o Numero de Horas Trbalhadas");
		horasTrabalhadas = input.nextFloat();
		System.out.println("Informe o Numero de Horas Extra Trbalhadas de segunda a sexta");
		horasTrabalhadasExtra = input.nextFloat();
		System.out.println("Informe o Numero de Horas Extra Trbalhadas de sabado a domingo");
		horasTrabalhadasExtraF = input.nextFloat();
		
		System.out.println("Informe o Valor Pago por Hora");
		salarioHora = input.nextFloat();
		
		funcionario.setName(name);
		funcionario.setDepartamento(departamento);
		funcionario.setHorasTrabalhadas(horasTrabalhadas,horasTrabalhadasExtra,horasTrabalhadasExtraF);
		funcionario.setSalarioHora(salarioHora);
		
		if((funcionario.getDepartamento()).equalsIgnoreCase(cargo))
		{
			resultado = 1;
			funcionario.setCalculaSalario(resultado);
		}
		else
		{	resultado = 0;
			funcionario.setCalculaSalario(resultado);
		}
	
		funcionario.InfoEmpregado();
	
	}

}
