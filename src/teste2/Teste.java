package teste2;

import implementacao2.GarcomDiretor;
import implementacao2.PizzaBuilder;
import implementacao2.PizzaItalianaBuilder;
import implementacao2.PizzaMargueritaBuilder;
import implementacao2.PizzaPortuguesaBuilder;
import implementacao2.ProdutoPizza;

public class Teste {
	public static void main(String[] args) {
		GarcomDiretor garcom = new GarcomDiretor();
		
		PizzaBuilder pizzaPortuguesaBuilder = new PizzaPortuguesaBuilder();
		ProdutoPizza pp = garcom.definePizzaBuilder(pizzaPortuguesaBuilder).montaPizza("pequena");
		pp.exibePizza();
		
		System.out.println("-------------------------------------");

		PizzaBuilder pizzaItalianaBuilder = new PizzaItalianaBuilder();
		garcom.definePizzaBuilder(pizzaItalianaBuilder);
		pp = garcom.montaPizza("media"); 
		pp.exibePizza(); 
		
		System.out.println("-------------------------------------");

		PizzaBuilder pizzaMargueritaBuilder = new PizzaMargueritaBuilder();
		garcom.definePizzaBuilder(pizzaMargueritaBuilder).montaPizza("grande").exibePizza();
	}
}
