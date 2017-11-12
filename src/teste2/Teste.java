package teste2;

import implementacao2.GarcomDiretor;
import implementacao2.PizzaItalianaBuilder;
import implementacao2.PizzaMargueritaBuilder;
import implementacao2.PizzaPortuguesaBuilder;

public class Teste {
	public static void main(String[] args) {
		GarcomDiretor garcom = new GarcomDiretor();
		
		garcom
			.definePizzaBuilder(new PizzaPortuguesaBuilder())
			.montaPizza("pequena")
			.exibePizza();		
		
		System.out.println("-------------------------------------");

		garcom
			.definePizzaBuilder(new PizzaItalianaBuilder())
			.montaPizza("media")
			.exibePizza();
		
		System.out.println("-------------------------------------");

		garcom
			.definePizzaBuilder(new PizzaMargueritaBuilder())
			.montaPizza("grande")
			.exibePizza();
	}
}
