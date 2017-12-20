package br.com.aluracursos;

import java.util.Collections;
import java.util.*;

public class Curso {

	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void matricula(Aluno aluno) {
		this.alunos.add(aluno);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public void setInstrutor(String instrutor) {
		this.instrutor = instrutor;
	}

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public void adiciona(Aula aula) {
		this.aulas.add(aula);
	}

	public int getTempoTotal() {
		int tempoTotal = 0;
		for (Aula aula : aulas) {
			tempoTotal += aula.getTempo();
		}
		return tempoTotal;
	}

	public boolean estaMatriculado(Aluno aluno) {
		return this.alunos.contains(aluno);
	}

	@Override
	public String toString() {
		return "[Curso: " + this.nome + " tempo total: " + this.getTempoTotal() + " aulas: [" + this.aulas + "] ]";
	}

	@Override
	public boolean equals(Object obj) {
		Aluno outroAulno = (Aluno) obj;
		return this.nome.equals(outroAulno.getNome());
	}

	@Override
	public int hashCode() {
		return this.nome.hashCode();
	}
}
