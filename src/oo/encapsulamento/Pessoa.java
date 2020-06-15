package oo.encapsulamento;

public class Pessoa {

	private int idade;
	private String name;
	
	
	public String GetName() {
		return name;
	}
	
	public void SetName(String novoName) {
		this.name = novoName;
	}
	
	
	public int getAge() {
		return idade;
	}
	
	
	public Pessoa(int idade, String Name) {
	   SetAge(idade);
	   SetName(Name);
	}

    public void SetAge (int novaidade) { 
    	 novaidade = Math.abs(novaidade);
    	if(novaidade>0 && novaidade < 120) {
    	this.idade =  novaidade;
    }
    	}
	
}
