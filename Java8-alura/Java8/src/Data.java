import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {
	public static void main(String[] args) {
		LocalDate agora = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String dataFormatada = formatter.format(agora);
		System.out.println(dataFormatada);
		
		LocalDate futuro = LocalDate.of(2099, Month.JANUARY, 25);
		System.out.println(futuro);
		
		Period periodo = Period.between(agora, futuro);
		System.out.println(periodo);
	}
}
