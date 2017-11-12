package implementacao2;

public abstract class PizzaBuilder {
	
	protected ProdutoPizza pizza;

	public ProdutoPizza getPizza() {
		return pizza;
	}

	public PizzaBuilder criaNovoProdutoPizza() {
		pizza = new ProdutoPizza();
		return this;
	}

	public abstract PizzaBuilder defineTipoPizza();

	public abstract PizzaBuilder defineTamPizza(String tamPizza);

	public abstract PizzaBuilder defineMassa();

	public abstract PizzaBuilder defineMolho();

	public abstract PizzaBuilder defineCobertura();
}
