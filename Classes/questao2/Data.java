package classes.questao2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Data {

	private String dia;
	private String mes;
	private String ano;
	

	public Data(String data) {
		
		if(isValida(data)) {
			String[] s;
			s = data.split("-");
			this.mes = s[1];
			this.dia = s[0];
			this.ano = s[2];
		}
		else {
			this.ano = "0001";
			this.mes = "01";
			this.dia = "01";
		}
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getMesExtenso() {
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };

		int m = Integer.parseInt(this.getMes());
		
		return (meses[m-1]);
		
	}
	
	public int compara(Data d) {
		
		
		String myD1, myD2;
		myD1 = this.getDia() + "-" + this.getMes() + "-" + this.getAno();
		myD2 = d.getDia() + "-" + d.getMes() + "-" + d.getAno();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date d1;
        int i = 1;
		try {
			d1 = sdf.parse(myD1);
			Date d2 = sdf.parse(myD2);
			if(d1.equals(d2)) {
				i = 0;
			}
			else if (d1.before(d2)) {
				i = 1;
			}
			
		
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return i;		
		
	}
	
	public boolean isBissexto() {
		
		int a;
		a = Integer.parseInt(this.getAno());
		
		return ((a % 4 == 0) && (a % 100 != 0) || (a % 400 == 0));
		
	}
	
	public Data clone() {
		String nova = this.getDia() + "-" + this.getMes() + "-" + this.getAno();
		Data d = new Data(nova);
		return d;
		
	}
	public static boolean isValida(String date) {
	  
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	    dateFormat.setLenient(false);
	    try {
	      dateFormat.parse(date.trim());
	    } catch (ParseException pe) {
	      return false;
	    }
	    return true;
	  }


}
