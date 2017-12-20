import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class TestaCurso {
	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		cursos.add(new Curso("Python", 45));
		cursos.add(new Curso("JavaScript", 150));
		cursos.add(new Curso("Java 8", 113));
		cursos.add(new Curso("C", 55));
		
		cursos.sort(Comparator.comparing(Curso::getAlunos));
		
		/*
		 * cursos.stream()
		 .filter(c -> c.getAlunos() > 50)
		 .map(c -> c.getAlunos())
		 .forEach(System.out);
		 
		 @media
		 cursos.stream()
		   .mapToInt(c -> c.getAlunos())
		   .average();
		 */
		
		cursos.stream()
		   .filter(c -> c.getAlunos() > 50)
		   .collect(Collectors.toList());
		
		
	}
}
