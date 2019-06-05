package school.cesar.impl.hospedagens;

import school.cesar.enums.Idioma;

public class Pousada extends Hospedagem {
	
	private boolean ofereceTraslado;
	
	public Pousada(
			double valorDaDiaria,
			boolean cafeDaManha,
			int horarioDoCheckIn,
			int horarioDoCheckOut,
			Idioma idiomasFalados,
			int tempoMinimoDeHospedagem,
			boolean permiteCancelamentoGratis,
			int avaliacaoDosUsuarios,
			boolean ofereceTraslado
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
		
		this.ofereceTraslado = ofereceTraslado;
		
	}
	
	public boolean isOfereceTraslado() {
		return ofereceTraslado;
	}

	public void setOfereceTraslado(boolean ofereceTraslado) {
		this.ofereceTraslado = ofereceTraslado;
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
				"Oferece Traslado: " + this.ofereceTraslado + "%n" +
				"Avaliação dos Usuários: " + super.avaliacaoDosUsuarios + "]" +"%n"
				);
	}

}
