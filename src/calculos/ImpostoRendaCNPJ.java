package calculos;

public class ImpostoRendaCNPJ implements Imposto {

	@Override
	public double imposto(double salario) {
		return (27.5 * salario) / 100;
	}

}
