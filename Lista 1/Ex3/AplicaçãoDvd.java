
import java.util.Scanner;

import java.util.Scanner;

public class AplicaçãoDvd {

	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int opcao;
		
		Dvd objeto = new Dvd();
		
		do
        {
	        System.out.println("\t\n Escolha a opção desejada");
	        System.out.println("1 - Liga");
	        System.out.println("2 - Desliga");
	        System.out.println("3 - Play");
	        System.out.println("4 - Stop");
	        System.out.println("5 - Pause");
	        System.out.println("6 - volta");
	        System.out.println("7 - Avança");
	        System.out.println("8 - Sair\n");
	        System.out.print("Opção: ");
	        opcao = input.nextInt();
	      
	        
	        switch(opcao)
		    {	       		
		    		case 1: 
		    				objeto.liga();;
		    				break;
		    							
		    		case 2: 
		    				objeto.desliga();;
		    				break;
				            
				    case 3: 
				    		objeto.play();
				    		break;	    		      
				    case 4:
				    	
					    	objeto.stop();
				            break;
				                    
				    case 5: 
					        objeto.pause();
				            break;
				            	 	
				    case 6: 
				    	 	objeto.volta();
				            break;
				    
				    case 7: 
			    	 		objeto.avanca();
			    	 		break;
				   
				    case 8: 
				    		System.out.println("Sistema encerrado.");
				    		break;
				   default:
				          	System.out.println("Opção inválida");
	        }
	        
	    }while(opcao!= 8);

	}

}
