package school.cesar.impl.carros;

import school.cesar.enums.Combustivel;

public class CarroExecutivo extends Carro {
	
	public CarroExecutivo(
			String placa,
			int anoDeFabricacao,
			double quilometragemRodadaTotal,
			int numeroDePassageiros,
			boolean arCondicionado,
			Combustivel tipoDeCombustivel,
			boolean aluguelComQuilometragemLivre,
			double valorDaDiaria
			) {
		
		super(
				placa,
				anoDeFabricacao,
				quilometragemRodadaTotal,
				numeroDePassageiros,
				arCondicionado,
				tipoDeCombustivel,
				aluguelComQuilometragemLivre,
				valorDaDiaria
				);
		
	}

}

