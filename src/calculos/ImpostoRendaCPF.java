package calculos;

public class ImpostoRendaCPF implements Imposto {

	@Override
	public double imposto(double salario) {
		return (22.5 * salario) / 100;
	}

}
