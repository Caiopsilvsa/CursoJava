package oo.composi��o;

public class Carro {

	Motor motor = new Motor ();
	
	void acelerar () {
		
		motor.fatorInje��o += 0.4;
		
	}
	
	void frear () {
		
		motor.fatorInje��o -= 0.4;
		
	}
	
	void ligar () {
	motor.ligado = true;
		
	}
	
	void desligar () {
		motor.ligado = false;
				
	}

    boolean status () {
    	return motor.ligado;
    	
    }

}

