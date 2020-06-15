package classes;

public class Data {

    int dia;
	int mes;
	int ano;
	
	Data (){
		dia = 1;
		mes = 1;
		ano = 1970;
		
	}
	
	Data (int ndia, int nmes,int nano){
		dia = ndia;
		mes = nmes;
		ano = nano;
			
		
	}
	
	
	String Dataformatada () {
		
		return String.format("%d/%d/%d",dia, mes, ano);
		
		
	}
	
	
}
