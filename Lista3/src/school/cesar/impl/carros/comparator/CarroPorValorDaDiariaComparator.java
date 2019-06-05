package school.cesar.impl.carros.comparator;

import java.util.Comparator;
import school.cesar.impl.carros.Carro;

public class CarroPorValorDaDiariaComparator implements Comparator<Carro> {
	
	@Override
	public int compare(Carro carro1, Carro carro2) {
		return (int) (carro1.getValorDaDiaria() - carro2.getValorDaDiaria());
	}

}
