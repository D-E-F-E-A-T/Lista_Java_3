package school.cesar.impl.carros;

import school.cesar.enums.Combustivel;
import school.cesar.interfs.Avaliavel;
import java.util.Scanner;


public abstract class Carro implements Avaliavel {
	
	protected String placa;
	protected int anoDeFabricacao;
	protected double quilometragemRodadaTotal;
	protected int numeroDePassageiros;
	protected boolean arCondicionado;
	protected Combustivel tipoDeCombustivel;
	protected boolean aluguelComQuilometragemLivre;
	protected double valorDaDiaria;
	
	public Carro(
			String placa,
			int anoDeFabricacao,
			double quilometragemRodadaTotal,
			int numeroDePassageiros,
			boolean arCondicionado,
			Combustivel tipoDeCombustivel,
			boolean aluguelComQuilometragemLivre,
			double valorDaDiaria
			) {
		
		this.placa = placa;
		this.anoDeFabricacao = anoDeFabricacao;
		this.quilometragemRodadaTotal = quilometragemRodadaTotal;
		this.numeroDePassageiros = numeroDePassageiros;
		this.arCondicionado = arCondicionado;
		this.tipoDeCombustivel = tipoDeCombustivel;
		this.aluguelComQuilometragemLivre = aluguelComQuilometragemLivre;
		this.valorDaDiaria = valorDaDiaria;
		
	}
	
	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}

	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public double getQuilometragemRodadaTotal() {
		return quilometragemRodadaTotal;
	}

	public void setQuilometragemRodadaTotal(double quilometragemRodadaTotal) {
		this.quilometragemRodadaTotal = quilometragemRodadaTotal;
	}

	public int getNumeroDePassageiros() {
		return numeroDePassageiros;
	}

	public void setNumeroDePassageiros(int numeroDePassageiros) {
		this.numeroDePassageiros = numeroDePassageiros;
	}

	public boolean isArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(boolean arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public Combustivel getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(Combustivel tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public boolean isAluguelComQuilometragemLivre() {
		return aluguelComQuilometragemLivre;
	}

	public void setAluguelComQuilometragemLivre(boolean aluguelComQuilometragemLivre) {
		this.aluguelComQuilometragemLivre = aluguelComQuilometragemLivre;
	}

	public double getValorDaDiaria() {
		return valorDaDiaria;
	}

	public void setValorDaDiaria(double valorDaDiaria) {
		this.valorDaDiaria = valorDaDiaria;
	}

	@Override
	public String toString() {
		
		return (
				"[Placa: " + this.placa + "%n" +
				"Ano de Fabricação: " + this.anoDeFabricacao + "%n" +
				"Quilometragem Rodada Total: " + this.quilometragemRodadaTotal + "%n" +
				"Número de Passageiros: " + this.numeroDePassageiros + "%n" +
				"Ar Condicionado: " + this.arCondicionado + "%n" +
				"Tipo de Combustível: " + this.tipoDeCombustivel + "%n" +
				"Aluguel com Quilometragem Livre: " + this.aluguelComQuilometragemLivre + "%n" +
				"Valor da Diária: " + this.valorDaDiaria + "]" + "%n"
				);
		
	}
	
	@Override
	public int receberNotaDeAvaliacao() {
		Scanner input = new Scanner(System.in);
		int nota;
		
		System.out.println("Qual sua nota de Avaliação? (0 a 10)");
		nota = input.nextInt();
		
		input.close();
		return nota;
	}

}
