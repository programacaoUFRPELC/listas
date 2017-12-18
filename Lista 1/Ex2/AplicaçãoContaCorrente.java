
import java.util.Scanner;
import java.util.ArrayList;


public class AplicaçãoContaCorrente {

	public static void main(String[] args) 
	{
        String nome;
		double valor;
		int opcao,numeroConta,numeroContaDestino;
		
	
		Scanner input = new Scanner(System.in);
	
        ArrayList<ContaCorrente>contaCliente = new ArrayList();
		ContaCorrente cliente,cliente2;
        		
        do
        {
	        System.out.println("\t\n Escolha a opção desejada");
	        System.out.println("1 - Cadastro CLiente");
	        System.out.println("2 - Extrato CLiente");
	        System.out.println("3 - Creditar valor na Conta");
	        System.out.println("4 - Debitar valor da Conta");
	        System.out.println("5 - Transferencia entre Contas");
	        System.out.println("6 - Sair\n");
	        System.out.print("Opção: ");
	        opcao = input.nextInt();
	        input.nextLine();
	        
	        switch(opcao)
		    {	       		
		    		case 1: 
			    			System.out.println("Cadastrando novo cliente.");      
			    		    System.out.printf("Digite o seu nome: ");
			    	        nome = input.nextLine();
			    	        
			    	    	while (nome.isEmpty()){
			    	    		System.out.println("Favor digitar um nome para a conta: ");
			    	    		nome = input.next();
			    	    	}
			    	    	 numeroConta = contaCliente.size() + 1;
			    	    	cliente = new ContaCorrente(nome, numeroConta);
			    	        contaCliente.add(cliente);
			    	       
			    	        break;
			    	        
		    					
		    		case 2: 
		    			  	System.out.print("Informe o Numero da conta:");
		    			  	numeroConta = input.nextInt();
		    			
		    				cliente = contaCliente.get(numeroConta - 1);
		    				  			  
		    			  	cliente.extrato();
				            break;
				            
				    case 3: 
					    	System.out.print("Informe o Numero da conta:");
		    			  	numeroConta = input.nextInt();
		    			
		    				cliente = contaCliente.get(numeroConta - 1);
		    				
		    				System.out.print("Digite o valor do Deposito R$:");
		    			  	valor = input.nextInt();
		    				cliente.creditar(valor);
				            break;	
				    	
				    case 4:
					    	System.out.print("Informe o Numero da conta:");
		    			  	numeroConta = input.nextInt();
		    			
		    				cliente = contaCliente.get(numeroConta - 1);
		    				
		    				System.out.print("Digite o valor do Saque R$:");
		    			  	valor = input.nextInt();
		    				cliente.debitar(valor);
				    		break;	    		      
					             
				    case 5: 
					    	System.out.print("Informe o Numero da conta de Origem:");
		    			  	numeroConta = input.nextInt();
		    				cliente = contaCliente.get(numeroConta - 1);
		    				
		    				System.out.print("Informe o Numero da conta de Destino:");
		    			  	numeroContaDestino = input.nextInt();
		    			  	cliente2 = contaCliente.get(numeroContaDestino - 1);
		    			  	
		    			  	System.out.println("");
		    				System.out.print("Digite o valor da Transferência R$:");
		    			  	valor = input.nextInt();
		    				cliente.transferir(valor, cliente2);
		    				System.out.println("");               
				            break;
				            	 	
				    case 6: 
				            System.out.println("Sistema encerrado.");
				            break;
				                    
				   default:
				          	System.out.println("Opção inválida");
	        }
	        
	    }while(opcao!= 6);
	}
}
	    
	   
	        
	    
	        

