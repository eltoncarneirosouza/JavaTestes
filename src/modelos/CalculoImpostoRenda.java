package modelos;

public class CalculoImpostoRenda {
	private double AliquotaImpostoCNPJ = 27.5;
	private double AliquotaImpostoCPF = 22.5;

	public double calcular(String documento, double salario) {
		if (documento.matches("CNPJ")) {
			return (this.AliquotaImpostoCNPJ * salario) / 100;
		} else if (documento.matches("CPF")) {
			return (this.AliquotaImpostoCPF * salario) / 100;
		}
		return 0;

	}
}
