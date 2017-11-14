package implementacao2;

public class PizzaItalianaBuilder extends PizzaBuilder {
	
	@Override
	protected ProdutoPizza criarProdutoFactoryMethod() {
		return new ProdutoPizzaItaliana();
	}
	
	@Override
	public PizzaBuilder defineTipoPizza() {
		pizza.defineTipoPizza("Italiana");
		return this;
	}

	@Override
	public PizzaBuilder defineTamPizza(String tamPizza) {
		pizza.defineTamPizza(tamPizza);
		return this;
	}

	@Override
	public PizzaBuilder defineMassa() {
		pizza.defineMassa("grossa");
		return this;
	}

	@Override
	public PizzaBuilder defineMolho() {
		pizza.defineMolho("apimentado");
		return this;
	}

	@Override
	public PizzaBuilder defineCobertura() {
		pizza.defineCobertura("pepperoni+salame");
		return this;
	}
}