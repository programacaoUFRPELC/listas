
public class Empregado 
{
	private String name;
	private String departamento;
	private float salarioHora;
	private float horasTrabalhadas;
	private float horasTrabalhadasExtra;
	private float horasTrabalhadasExtraF;
	private float salario;

	
	public Empregado()
	{
		
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setDepartamento(String departamento)
	{
		this.departamento = departamento;
		
	}
	public void setSalarioHora(float salarioHora)
	{
		this.salarioHora = salarioHora;
		
	}
	public void setHorasTrabalhadas(float horasTrabalhadas,float horasTrabalhadasExtra,float horasTrabalhadasExtraF)
	{
		this.horasTrabalhadas = horasTrabalhadas;
		this.horasTrabalhadasExtra = horasTrabalhadasExtra;
		this.horasTrabalhadasExtraF = horasTrabalhadasExtraF;
	}
	public void setCalculaSalario(int resultado)
	{
	    
		this.salario = this.salario + (this.salarioHora*this.horasTrabalhadas)
				+(1.5f*(this.salarioHora)*this.horasTrabalhadasExtra)
				+(2*(this.salarioHora)*this.horasTrabalhadasExtraF);
		
		if(resultado == 1)
		{
			this.salario = this.salario+(0.1f*this.salario);
		}
		else
		{
			this.salario = this.salario+(0*this.salario);
		}
	}

	public String getName()
	{
		return(name);
	}
	public String getDepartamento()
	{
		return(departamento);
	}
	public float getSalarioHora()
	{
		return(salarioHora);
	}
	public float getHorasTrabalhadas()
	{
		return(horasTrabalhadas);
	}
	public float getCalculaSalario()
	{
		return(salario);
	}
	public void InfoEmpregado()
	{
		System.out.printf("Nome do Funcionario: %s\n",this.name);
		System.out.printf("Departamento: %s\n",this.departamento);
		System.out.printf("Salario: %.2f\n",this.salario);
	}

	
}
