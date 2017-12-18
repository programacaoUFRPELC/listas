
public class Dvd 
{
	private boolean estado;
	private String operacaoEmExecucao;
	private final String PARADO = "";
	private final String REPRODUZINDO  = " REPRODUZINDO O DVD";
	private final String EM_PAUSA  = " REPRODUÇÃO DO DVD EM PAUSA...";
	private final String VOLTANDO  = "VOLTANDO O DVD...";
	private final String AVANCANDO ="AVANÇANDO O DVD";
	private boolean LIGADO = true;
	private boolean DESLIGADO = false;

	public Dvd()
	{		
		this.estado = false;
		this.operacaoEmExecucao = PARADO;
	}	 

	
	
	
	public void liga()
	{
		this.estado = LIGADO;
		this.operacaoEmExecucao = PARADO;
		System.out.println("Ligando DVD");
		System.out.println("DVD "+ this.estado);
		System.out.printf("DVD:%s Esperando Instruções.",this.operacaoEmExecucao);
		System.out.printf("\n\n");
	}
	
	public void desliga()
	{
		this.estado = DESLIGADO;
		this.operacaoEmExecucao = PARADO;
		System.out.println("DVD: "+ this.operacaoEmExecucao);
		System.out.printf("Desligando DVD\n");
		System.out.println("DVD "+ this.estado);
		System.out.printf("\n\n");
	}
	
	public void play()
	{
		if(estado == LIGADO)
		{
			this.operacaoEmExecucao = REPRODUZINDO;
			System.out.println("DVD: "+ this.estado);
			System.out.printf("PLAY: %s.",this.operacaoEmExecucao);
			System.out.printf("\n\n");
		}
	}
	
	public void stop()
	{
		if(estado == LIGADO)
		{
			this.operacaoEmExecucao = PARADO;
			System.out.println("DVD: "+ this.estado);
			System.out.printf("DVD: %s.",this.operacaoEmExecucao);
			System.out.printf("\n\n");
		}
	}
	
	public void pause()
	{
		if(estado == LIGADO)
		{
			this.operacaoEmExecucao = EM_PAUSA;
			System.out.println("DVD "+ this.estado);
			System.out.printf("DVD: %s Esperando Instruções.",this.operacaoEmExecucao);
			System.out.printf("\n\n");
		}
	}
	
	public void volta()
	{
		if(estado == LIGADO)
		{
			this.operacaoEmExecucao = VOLTANDO;
			System.out.println("DVD "+ this.estado);
			System.out.printf("DVD: %s",this.operacaoEmExecucao);
			System.out.printf("\n\n");
		}
	}
	
	public void avanca()
	{
		if(estado == LIGADO)
		{
			this.operacaoEmExecucao = AVANCANDO;
			System.out.println("DVD "+ this.estado);
			System.out.printf("DVD: %s",this.operacaoEmExecucao);
			System.out.printf("\n\n");
		}
	}
	
}
