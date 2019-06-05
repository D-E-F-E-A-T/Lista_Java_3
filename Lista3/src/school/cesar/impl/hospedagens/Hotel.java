package school.cesar.impl.hospedagens;

import school.cesar.enums.Idioma;

public class Hotel extends Hospedagem {
	
	private boolean ofereceTraslados;
	private int numeroDeEstrelas;
	
	public Hotel(
			double valorDaDiaria,
			boolean cafeDaManha,
			int horarioDoCheckIn,
			int horarioDoCheckOut,
			Idioma idiomasFalados,
			int tempoMinimoDeHospedagem,
			boolean permiteCancelamentoGratis,
			int avaliacaoDosUsuarios,
			boolean ofereceTraslados,
			int numeroDeEstrelas
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
		
		this.ofereceTraslados = ofereceTraslados;
		this.numeroDeEstrelas = numeroDeEstrelas;
		
	}
	
	public boolean isOfereceTraslados() {
		return ofereceTraslados;
	}

	public void setOfereceTraslados(boolean ofereceTraslados) {
		this.ofereceTraslados = ofereceTraslados;
	}

	public int getNumeroDeEstrelas() {
		return numeroDeEstrelas;
	}

	public void setNumeroDeEstrelas(int numeroDeEstrelas) {
		this.numeroDeEstrelas = numeroDeEstrelas;
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
				"Oferece Traslados: " + this.ofereceTraslados + "%n" +
				"Número de Estrelas: " + this.numeroDeEstrelas + "%n" +
				"Avaliação dos Usuários: " + super.avaliacaoDosUsuarios + "]" +"%n"
				);
	}

}
