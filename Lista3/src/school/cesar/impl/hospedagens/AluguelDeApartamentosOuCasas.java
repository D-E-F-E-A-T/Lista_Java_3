package school.cesar.impl.hospedagens;

import school.cesar.enums.Idioma;

public class AluguelDeApartamentosOuCasas extends Hospedagem {
	
	private int numeroDeQuartos;
	private boolean possuiCozinha;
	
	public AluguelDeApartamentosOuCasas(
			double valorDaDiaria,
			boolean cafeDaManha,
			int horarioDoCheckIn,
			int horarioDoCheckOut,
			Idioma idiomasFalados,
			int tempoMinimoDeHospedagem,
			boolean permiteCancelamentoGratis,
			int avaliacaoDosUsuarios,
			int numeroDeQuartos,
			boolean possuiCozinha
			) {
		
		super(
				valorDaDiaria,
				cafeDaManha,
				horarioDoCheckIn,
				horarioDoCheckOut,
				idiomasFalados,
				tempoMinimoDeHospedagem,
				permiteCancelamentoGratis,
				avaliacaoDosUsuarios
				);
		
		this.numeroDeQuartos = numeroDeQuartos;
		this.possuiCozinha = possuiCozinha;
		
	}
	
	public int getNumeroDeQuartos() {
		return numeroDeQuartos;
	}

	public void setNumeroDeQuartos(int numeroDeQuartos) {
		this.numeroDeQuartos = numeroDeQuartos;
	}

	public boolean isPossuiCozinha() {
		return possuiCozinha;
	}

	public void setPossuiCozinha(boolean possuiCozinha) {
		this.possuiCozinha = possuiCozinha;
	}

	@Override
	public String toString() {
		return (
				"Valor da Diária: " + super.valorDaDiaria + "%n" +
				"Café da Manhã: " + super.cafeDaManha + "%n" +
				"Horário do Check-In: " + super.horarioDoCheckIn + "%n" +
				"Horário do Check-Out: " + super.horarioDoCheckOut + "%n" +
				"Idiomas Falados: " + super.idiomasFalados + "%n" +
				"Tempo Mínimo de Hospedagem: " + super.tempoMinimoDeHospedagem + "%n" +
				"Permite Cancelamento Grátis: " + super.permiteCancelamentoGratis + "%n" +
				"Número de Quartos: " + this.numeroDeQuartos + "%n" +
				"Possui Cozinha: " + this.possuiCozinha + "%n" +
				"Avaliação dos Usuários: " + super.avaliacaoDosUsuarios + "]" +"%n"
				);
	}

}
