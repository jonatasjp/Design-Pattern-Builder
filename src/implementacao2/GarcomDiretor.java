package implementacao2;

public class GarcomDiretor {

	private PizzaBuilder pizzaBuilder;

	public GarcomDiretor definePizzaBuilder(PizzaBuilder pizzaBuilder) {
		this.pizzaBuilder = pizzaBuilder;
		return this;
	}

	public ProdutoPizza montaPizza(String tamPizza) {
		
		return pizzaBuilder.criaNovoProdutoPizza()
		.defineTamPizza(tamPizza)
		.defineTipoPizza()
		.defineMassa()
		.defineMolho()
		.defineCobertura()
		.getPizza();
	
	}
}
