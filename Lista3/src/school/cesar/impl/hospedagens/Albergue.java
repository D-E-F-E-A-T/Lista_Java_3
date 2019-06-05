package school.cesar.impl.hospedagens;

import school.cesar.enums.Idioma;

public class Albergue extends Hospedagem {
	
	private int hospedesPorQuarto;
	
	public Albergue(
			double valorDaDiaria,
			boolean cafeDaManha,
			int horarioDoCheckIn,
			int horarioDoCheckOut,
			Idioma idiomasFalados,
			int tempoMinimoDeHospedagem,
			boolean permiteCancelamentoGratis,
			int avaliacaoDosUsuarios,
			int hospedesPorQuarto
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
		
		this.hospedesPorQuarto = hospedesPorQuarto;
		
	}
	
	public int getHospedesPorQuarto() {
		return hospedesPorQuarto;
	}

	public void setHospedesPorQuarto(int hospedesPorQuarto) {
		this.hospedesPorQuarto = hospedesPorQuarto;
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
				"Hóspedes por Quarto: " + this.hospedesPorQuarto + "%n" +
				"Avaliação dos Usuários: " + super.avaliacaoDosUsuarios + "]" +"%n"
				);
	}

}
