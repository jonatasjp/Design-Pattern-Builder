package implementacao3;

public class PizzaItalianaBuilder implements PizzaBuilder{
	
	private Pizza pizza;
	
	public PizzaItalianaBuilder() {
		this.pizza = new Pizza();
	}
	
	@Override
	public PizzaBuilder defineTipoPizza() {
		this.pizza.setTipoPizza("Italiana");
		return this;
	}

	@Override
	public PizzaBuilder defineTamPizza(String tamPizza) {
		this.pizza.setTamPizza(tamPizza);
		return this;
	}

	@Override
	public PizzaBuilder defineMassa() {
		this.pizza.setMassa("grossa");
		return this;
	}

	@Override
	public PizzaBuilder defineMolho() {
		this.pizza.setMolho("apimentado");
		return this;
	}

	@Override
	public PizzaBuilder defineCobertura() {
		this.pizza.setCobertura("pepperoni+salame");
		return this;
	}

	@Override
	public Pizza build() {
		return this.pizza;
	}

}
