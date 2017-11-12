package implementacao2;

public abstract class PizzaBuilder {
	
	protected ProdutoPizza pizza;

	public ProdutoPizza getPizza() {
		return pizza;
	}

	public void criaNovoProdutoPizza() {
		pizza = new ProdutoPizza();
	}

	public abstract void defineTipoPizza();

	public abstract void defineTamPizza(String tamPizza);

	public abstract void defineMassa();

	public abstract void defineMolho();

	public abstract void defineCobertura();
}
