package implementacao2;

public class PizzaMargueritaBuilder extends PizzaBuilder {
	@Override
	public PizzaBuilder defineTipoPizza() {
		pizza.defineTipoPizza("Marguerita");
		return this;
	}

	@Override
	public PizzaBuilder defineTamPizza(String tamPizza) {
		pizza.defineTamPizza(tamPizza);
		return this;
	}

	@Override
	public PizzaBuilder defineMassa() {
		pizza.defineMassa("fina");
		return this;
	}

	@Override
	public PizzaBuilder defineMolho() {
		pizza.defineMolho("tomate");
		return this;
	}

	@Override
	public PizzaBuilder defineCobertura() {
		pizza.defineCobertura("tomate+orégano");
		return this;
	}
}