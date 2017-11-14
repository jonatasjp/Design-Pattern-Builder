package implementacao3;

public class GarcomDiretor {
	
	private PizzaBuilder builder;
	
	public GarcomDiretor defineBuilder(PizzaBuilder builder) {
		this.builder = builder;
		return this;
	}
	
	public Pizza montarPizza(){
		return builder
			   .defineCobertura()
			   .defineMassa()
			   .defineMolho()
			   .defineTamPizza("grande")
			   .defineTipoPizza()
			   .build();
	}
	
	public static void main(String[] args) {
		
		new GarcomDiretor()
				.defineBuilder(new PizzaItalianaBuilder())
				.montarPizza()
				.exibePizza();
		
	}

}
