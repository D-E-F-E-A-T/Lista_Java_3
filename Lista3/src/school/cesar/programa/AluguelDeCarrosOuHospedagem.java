package school.cesar.programa;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import school.cesar.enums.*;
import school.cesar.exceptions.*;
import school.cesar.impl.carros.*;
import school.cesar.impl.carros.comparator.*;
import school.cesar.impl.hospedagens.*;
import school.cesar.impl.hospedagens.comparator.*;


public class AluguelDeCarrosOuHospedagem {

	public static void main(String[] args) {
		
		String opcao;
		
		Scanner input = new Scanner(System.in);
		
		Carro carro1 = new CarroBasico(
				"JKI-8754",
				1986,
				6000,
				5,
				true,
				Combustivel.GASOLINA,
				false,
				50);
		Carro carro2 = new CarroBasico(
				"JKI-8754",
				1998,
				6000,
				5,
				true,
				Combustivel.GASOLINA,
				false,
				50);
		Carro carro3 = new CarroComum(
				"JKI-8754",
				2003,
				6000,
				5,
				true,
				Combustivel.FLEX,
				false,
				50);
		Carro carro4 = new CarroExecutivo(
				"JKI-8754",
				2014,
				6000,
				5,
				true,
				Combustivel.FLEX,
				false,
				50);
		Carro carro5 = new CarroDeLuxo(
				"JKI-8754",
				2019,
				6000,
				5,
				true,
				Combustivel.DIESEL,
				false,
				50);
		
		List<Carro> listaDeCarros = new ArrayList<Carro>();
		
		listaDeCarros.add(carro1);
		listaDeCarros.add(carro2);
		listaDeCarros.add(carro3);
		listaDeCarros.add(carro4);
		listaDeCarros.add(carro5);
		
		/*
		Hospedagem hospedagem1 = new Hotel();
		Hospedagem hospedagem2 = new Hotel();
		Hospedagem hospedagem3 = new AluguelDeApartamentosOuCasas();
		Hospedagem hospedagem4 = new AluguelDeApartamentosOuCasas();
		Hospedagem hospedagem5 = new Pousada();
		Hospedagem hospedagem6 = new Albergue();
		
		List<Hospedagem> hospedagens = new ArrayList<Hospedagem>();
		*/
		
		try {
			
			System.out.println("Escolha qual serviço você deseja:");
			System.out.println("1 -> Aluguel de Carro");
			System.out.println("2 -> Aluguel de Hospedagem");
			opcao = input.nextLine();
			
			if (opcao.equals("1")) {
				System.out.println("Deseja um critério para ordenar os resultados? [Y/n]");
				opcao = input.nextLine();
				
				if (opcao.equalsIgnoreCase("Y")) {
					System.out.println("Qual critério deseja adotar?");
					System.out.println("1 -> Ano de Fabricação");
					System.out.println("2 -> Valor da Diária");
					opcao = input.nextLine();
					
					if (opcao.equals("1")) {
						Collections.sort(listaDeCarros, new CarroPorAnoDeFabricacaoComparator());
						for (Carro carro : listaDeCarros) {
							System.out.println(carro.toString());
							System.out.println();
						} 
					} else {
						Collections.sort(listaDeCarros, new CarroPorValorDaDiariaComparator());
						for (Carro carro : listaDeCarros) {
							System.out.println(carro.toString());
						}
					}
				}
			}
			
		} catch (CarNotFoundException e) {
			System.err.printf("%nException: %s%n", e);
			System.out.println("Carro não encontrado. Tente Novamente.");
		}
		
		

	}

}
