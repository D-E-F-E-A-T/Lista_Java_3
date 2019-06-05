package school.cesar.impl.carros.comparator;

import java.util.Comparator;
import school.cesar.impl.carros.Carro;

public class CarroPorAnoDeFabricacaoComparator implements Comparator<Carro> {
	
	@Override
	public int compare(Carro carro1, Carro carro2) {
		return carro1.getAnoDeFabricacao() - carro2.getAnoDeFabricacao();
	}
	

}
