package br.com.aluracursos;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {
		String curso1 = "Conhecendo mais sobre listas";
		String curso2 = "Modelando a classe curso";
		String curso3 = "Trabalhando com Cursos e Sets";

		ArrayList<String> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
				            
		System.out.println(cursos);
                            
		cursos.remove(0);    
                            
		System.out.println(cursos);
                            
		for (String curso : cursos) {
			System.out.println("curso: " + curso);
		}

		String primeiracurso = cursos.get(0);
		System.out.println("A primeira curso é: " + primeiracurso);

		for (int i = 0; i < cursos.size(); i++) {
			System.out.println("cursos:" + cursos.get(i));

		}

		System.out.println(cursos.size());

		cursos.forEach(curso -> {
			System.out.println("percorrendo: ");
			System.out.println("curso: " + curso);
		});
		
		cursos.add("Aumento nosso conhecimento");
		System.out.println(cursos);
		
		Collections.sort(cursos);
		System.out.println("Ordenando para ordem alfabética");
		System.out.println(cursos);

	}
}
