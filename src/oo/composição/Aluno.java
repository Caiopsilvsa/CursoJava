package oo.composi��o;

import java.util.ArrayList;

public class Aluno {

	 String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	
	void adcCuros(Curso curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
		
		
	}
 
	 Aluno(String nome){
		 this.nome = nome;
	 }

}
