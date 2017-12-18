

import java.util.Scanner;

public class ContaCorrente 
{
	 	private String correntista;
	    private int numeroConta;
	    private double saldo;
	    
	    
	    public ContaCorrente(String nome, int conta)
	    {
	    	this.correntista=nome;   	
	    	this.numeroConta = conta;
	    	this.saldo = 0;  
	    }
	    
	    
	    public String getCorrentista() {
			return correntista;
		}


		public void setCorrentista(String correntista) {
			this.correntista = correntista;
		}


		public int getNumeroConta() {
			return numeroConta;
		}


		public void setNumeroConta(int numeroConta) {
			this.numeroConta = numeroConta;
		}


		public void extrato()
	    {
	    		System.out.println("\t\tEXTRATO");
		        System.out.println("Nome: " + correntista);
		        System.out.println("Número da conta: " + this.getNumeroConta());
		        System.out.printf("Saldo atual R$: " + this.saldo + "\n");
		        
	    }
	    
	    public void debitar(double valor)
	    {
	        if(this.saldo >= valor && valor > 0)
	        {
	            this.saldo -= valor;
	            System.out.println("Sacado R$: " + valor);
	            System.out.println("Novo saldo R$: " + this.saldo + "\n");
	        }
	        else 
	        {
	            System.out.println("Saldo insuficiente! Faça um depósito\n");
	        }
	    }
	    
	    public void creditar(double valor)
	    {
	    	if(valor > 0)
	    	{
		    	this.saldo += valor;
		        System.out.println("Depositado R$: " + valor);
		        System.out.println("Novo saldo R$: " + this.saldo + "\n");
	    	}
	    	
	    	else{
	    		System.out.println("Crédito não efetuado.  O valor precisa ser maior que zero.");
	    	}
	    }
	    
	    
	    public void transferir(double valor, ContaCorrente c2)
	    {
	    	
	    	
	    	if(this.saldo > 0 && !(c2 == null) &&  this.saldo >= valor ) 
	        {
	    		
	    		System.out.println("Realizando Transferência!");
		    	System.out.println("");
		    	
	            this.saldo -= valor;
	            c2.saldo += valor;
	            System.out.println("Sacado R$: " + valor);
	            System.out.println("Novo saldo R$: " + this.saldo + "\n");
	            System.out.println("Conta Destino: " + c2.correntista+ "\n");
	            System.out.println("Saldo Conta Destino R$: " + c2.saldo + "\n");
	            
		    	System.out.println("Fim do Saque!");
	        }
	        else 
	        {
	            System.out.println("Saldo insuficiente. Faça um depósito\n");
	        }
	    

	    	
	    }
	    
}
	    
	   
