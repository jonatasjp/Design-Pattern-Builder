package implementacao2;

public class PizzaPortuguesaBuilder extends PizzaBuilder {
	
	@Override
	protected ProdutoPizza criarProdutoFactoryMethod() {
		return new ProdutoPizzaPortuguesa();
	}
	
	@Override
	public PizzaBuilder defineTipoPizza() {
		pizza.defineTipoPizza("Portuguesa");
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
		pizza.defineMolho("não apimentado");
		return this;
	}

	@Override
	public PizzaBuilder defineCobertura() {
		pizza.defineCobertura("ovo+azeitona");
		return this;
	}
}