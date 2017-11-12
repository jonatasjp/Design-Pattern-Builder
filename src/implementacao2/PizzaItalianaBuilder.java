package implementacao2;

public class PizzaItalianaBuilder extends PizzaBuilder {
	@Override
	public void defineTipoPizza() {
		pizza.defineTipoPizza("Italiana");
	}

	@Override
	public void defineTamPizza(String tamPizza) {
		pizza.defineTamPizza(tamPizza);
	}

	@Override
	public void defineMassa() {
		pizza.defineMassa("grossa");
	}

	@Override
	public void defineMolho() {
		pizza.defineMolho("apimentado");
	}

	@Override
	public void defineCobertura() {
		pizza.defineCobertura("pepperoni+salame");
	}
}