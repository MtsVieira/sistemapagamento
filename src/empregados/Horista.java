package empregados;
import java.sql.Date;


public class Horista extends Empregado {
	public Horista(String nome, String endereco, boolean sindicato) {
		super(nome, endereco, sindicato);

	}
	private double salarioHorario;
	private int totalHora;
	private int dia;
	private int mes;
	private int ano;
	private Date data;
}