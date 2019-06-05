package school.cesar.interfs;

import java.util.Calendar;

public interface Arrumavel {
	
	default void imprimirDataEHoraDaArrumacao() {
		Calendar calendar = Calendar.getInstance();
		System.out.println("Data e hora da última arrumação: " + calendar.getTime());
	};

}
