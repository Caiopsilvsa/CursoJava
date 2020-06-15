package oo.composição;

import java.util.ArrayList;

public class Curso {

	ArrayList<Aluno>alunos = new ArrayList<>();
	 String nome;
	
	  void adcAluno (Aluno aluno) {
		  this.alunos.add(aluno);
		  aluno.cursos.add(this);
		  
	  }

       Curso(String nome){
    	   this.nome = nome;
       }
}
