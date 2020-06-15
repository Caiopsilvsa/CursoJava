package oo.composição;

public class Carro {

	Motor motor = new Motor ();
	
	void acelerar () {
		
		motor.fatorInjeção += 0.4;
		
	}
	
	void frear () {
		
		motor.fatorInjeção -= 0.4;
		
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

