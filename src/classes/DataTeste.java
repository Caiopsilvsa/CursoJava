package classes;

public class DataTeste {
     public static void main(String[] args) {
	
     Data d1 = new Data();
     /*d1.dia = 20;
     d1.mes = 12;
     d1.ano = 2020; */
     
     Data d2 = new Data(23,12,2019);
     
     
     String datav = d1.Dataformatada(); 
     
    System.out.println(datav);
    
    String datav2 = d2.Dataformatada();
     
     System.out.println( datav2);
     
     }
	
}
