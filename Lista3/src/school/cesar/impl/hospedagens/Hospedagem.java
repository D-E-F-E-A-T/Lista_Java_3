package school.cesar.impl.hospedagens;

import java.util.Scanner;

import school.cesar.enums.Idioma;
import school.cesar.interfs.*;

public abstract class Hospedagem implements Avaliavel, Arrumavel {
	
	protected double valorDaDiaria;
	protected boolean cafeDaManha;
	protected int horarioDoCheckIn;
	protected int horarioDoCheckOut;
	protected Idioma idiomasFalados;
	protected int tempoMinimoDeHospedagem;
	protected boolean permiteCancelamentoGratis;
	protected int avaliacaoDosUsuarios;
	
	public Hospedagem(
			double valorDaDiaria,
			boolean cafeDaManha,
			int horarioDoCheckIn,
			int horarioDoCheckOut,
			Idioma idiomasFalados,
			int tempoMinimoDeHospedagem,
			boolean permiteCancelamentoGratis,
			int avaliacaoDosUsuarios
			) {
		
		this.valorDaDiaria = valorDaDiaria;
		this.cafeDaManha = cafeDaManha;
		this.horarioDoCheckIn = horarioDoCheckIn;
		this.horarioDoCheckOut = horarioDoCheckOut;
		this.idiomasFalados = idiomasFalados;
		this.tempoMinimoDeHospedagem = tempoMinimoDeHospedagem;
		this.permiteCancelamentoGratis = permiteCancelamentoGratis;
		this.avaliacaoDosUsuarios = avaliacaoDosUsuarios;
		
	}
	
	public double getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(double valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}

	public boolean isCafeDaManha() {
		return cafeDaManha;
	}

	public void setCafeDaManha(boolean cafeDaManha) {
		this.cafeDaManha = cafeDaManha;
	}

	public int getHorarioDoCheckIn() {
		return horarioDoCheckIn;
	}

	public void setHorarioDoCheckIn(int horarioDoCheckIn) {
		this.horarioDoCheckIn = horarioDoCheckIn;
	}

	public int getHorarioDoCheckOut() {
		return horarioDoCheckOut;
	}

	public void setHorarioDoCheckOut(int horarioDoCheckOut) {
		this.horarioDoCheckOut = horarioDoCheckOut;
	}

	public Idioma getIdiomasFalados() {
		return idiomasFalados;
	}

	public void setIdiomasFalados(Idioma idiomasFalados) {
		this.idiomasFalados = idiomasFalados;
	}

	public int getTempoMinimoDeHospedagem() {
		return tempoMinimoDeHospedagem;
	}

	public void setTempoMinimoDeHospedagem(int tempoMinimoDeHospedagem) {
		this.tempoMinimoDeHospedagem = tempoMinimoDeHospedagem;
	}

	public boolean isPermiteCancelamentoGratis() {
		return permiteCancelamentoGratis;
	}

	public void setPermiteCancelamentoGratis(boolean permiteCancelamentoGratis) {
		this.permiteCancelamentoGratis = permiteCancelamentoGratis;
	}

	public int getAvaliacaoDosUsuarios() {
		return avaliacaoDosUsuarios;
	}

	public void setAvaliacaoDosUsuarios(int avaliacaoDosUsuarios) {
		this.avaliacaoDosUsuarios = avaliacaoDosUsuarios;
	}

	@Override
	public String toString() {
		return (
				"Valor da Diária: " + this.valorDaDiaria + "%n" +
				"Café da Manhã: " + this.cafeDaManha + "%n" +
				"Horário do Check-In: " + this.horarioDoCheckIn + "%n" +
				"Horário do Check-Out: " + this.horarioDoCheckOut + "%n" +
				"Idiomas Falados: " + this.idiomasFalados + "%n" +
				"Tempo Mínimo de Hospedagem: " + this.tempoMinimoDeHospedagem + "%n" +
				"Permite Cancelamento Grátis: " + this.permiteCancelamentoGratis + "%n" +
				"Avaliação dos Usuários: " + this.avaliacaoDosUsuarios + "]" +"%n"
				);
	}
	
	
	@Override
	public int receberNotaDeAvaliacao() {
		Scanner input = new Scanner(System.in);
		int nota;
		
		System.out.println("Qual sua nota de Avaliação? (0 a 10)");
		nota = input.nextInt();
		
		input.close();
		return nota;
	}

}
