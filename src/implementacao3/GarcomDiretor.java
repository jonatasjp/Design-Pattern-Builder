package implementacao3;

public class GarcomDiretor {
	
	private PizzaBuilder builder;
	
	public GarcomDiretor defineBuilder(PizzaBuilder builder) {
		this.builder = builder;
		return this;
	}
	
	public Pizza montarPizza(String tamPizza){
		return builder
			   .defineCobertura()
			   .defineMassa()
			   .defineMolho()
			   .defineTamPizza(tamPizza)
			   .defineTipoPizza()
			   .build();
	}
	
	public static void main(String[] args) {
		
		new GarcomDiretor()
				.defineBuilder(new PizzaItalianaBuilder())
				.montarPizza("grande")
				.exibePizza();
		
	}

}
