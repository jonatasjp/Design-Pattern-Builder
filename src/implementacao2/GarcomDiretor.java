package implementacao2;

public class GarcomDiretor {

	private PizzaBuilder pizzaBuilder;

	public GarcomDiretor definePizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
		return this;
	}

	public ProdutoPizza montaPizza(String tamPizza) {
		// (4.1) cria novo Produto, agora com tamanho definido!
		pizzaBuilder.criaNovoProdutoPizza();
		pizzaBuilder.defineTipoPizza();
		pizzaBuilder.defineTamPizza(tamPizza);
		pizzaBuilder.defineMassa();
		pizzaBuilder.defineMolho();
		pizzaBuilder.defineCobertura();
		// (4.2) entrega produto
		return pizzaBuilder.getPizza();
	}
}
