package implementacao3;

public interface PizzaBuilder {

	public PizzaBuilder defineTipoPizza();
	
	public PizzaBuilder defineTamPizza(String tamPizza);
	
	public PizzaBuilder defineMassa();
	
	public PizzaBuilder defineMolho();
	
	public PizzaBuilder defineCobertura();
	
	public Pizza build();
	
}
