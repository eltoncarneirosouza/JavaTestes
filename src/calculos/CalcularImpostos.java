package calculos;

public class CalcularImpostos {
	public double impostoCalculado(double salario, Imposto imposto) {
		return imposto.imposto(salario);
	}
}
