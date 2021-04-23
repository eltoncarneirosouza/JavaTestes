package teste;

import calculos.CalcularImpostos;
import calculos.ImpostoRendaCNPJ;
import calculos.ImpostoRendaCPF;

public class Teste {

	public static void main(String[] args) {
		double salario = 1000.0;
		ImpostoRendaCNPJ cnpj = new ImpostoRendaCNPJ();
		ImpostoRendaCPF cpf = new ImpostoRendaCPF();
		CalcularImpostos impostos = new CalcularImpostos();
		System.out.println("Imposto de renda sobre o CPF: " + impostos.impostoCalculado(salario, cpf));
		System.out.println("Imposto de renda sobre o CNPJ: " + impostos.impostoCalculado(salario, cnpj));

	}
}
