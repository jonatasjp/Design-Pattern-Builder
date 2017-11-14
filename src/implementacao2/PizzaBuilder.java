package implementacao2;

public abstract class PizzaBuilder {
	
	protected ProdutoPizza pizza;

	public ProdutoPizza getPizza() {
		return pizza;
	}

	public PizzaBuilder criaNovoProdutoPizza() {
		pizza = criarProdutoFactoryMethod();
		return this;
	}
	
	protected abstract ProdutoPizza criarProdutoFactoryMethod();

	public abstract PizzaBuilder defineTipoPizza();

	public abstract PizzaBuilder defineTamPizza(String tamPizza);

	public abstract PizzaBuilder defineMassa();

	public abstract PizzaBuilder defineMolho();

	public abstract PizzaBuilder defineCobertura();
}
