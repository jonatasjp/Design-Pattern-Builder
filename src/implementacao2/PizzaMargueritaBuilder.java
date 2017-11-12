package implementacao2;

public class PizzaMargueritaBuilder extends PizzaBuilder {
	@Override
	public void defineTipoPizza() {
		pizza.defineTipoPizza("Marguerita");
	}

	@Override
	public void defineTamPizza(String tamPizza) {
		pizza.defineTamPizza(tamPizza);
	}

	@Override
	public void defineMassa() {
		pizza.defineMassa("fina");
	}

	@Override
	public void defineMolho() {
		pizza.defineMolho("tomate");
	}

	@Override
	public void defineCobertura() {
		pizza.defineCobertura("tomate+orégano");
	}
}