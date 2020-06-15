package oo.composição;

public class CursoTeste {

	public static void main(String[] args) {
		Aluno a1 = new Aluno("João");
		Aluno a2 = new Aluno("Maria");
		Aluno a3 = new Aluno("Pedro");
		
		Curso c1 = new Curso("Curso Java");
		Curso c2 = new Curso("Curso Js");
		Curso c3 = new Curso("Curso React");
	
	c1.adcAluno(a1);
	c1.adcAluno(a2);
	
	c2.adcAluno(a1);
	c2.adcAluno(a3);
	
	a1.adcCuros(c3);
	a2.adcCuros(c3);
	
		
		
	}
}
