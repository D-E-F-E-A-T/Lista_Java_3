package school.cesar.impl.hospedagens.comparator;

import java.util.Comparator;
import school.cesar.impl.hospedagens.Hospedagem;

public class HospedagemPorValorDaDiariaComparator implements Comparator<Hospedagem> {
	
	@Override
	public int compare(Hospedagem hospedagem1, Hospedagem hospedagem2) {
		return (int) (hospedagem1.getValorDaDiaria() - hospedagem2.getValorDaDiaria());
	}
	

}
