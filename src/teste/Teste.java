package teste;

import implementacao.Pizza;

public class Teste {

	public static void main(String[] args) {
		
		new Pizza.PizzaBuilder("Portuguesa", "pequena")
				.defineMassa("fina")
				.defineMolho("n�o apimentado")
				.defineCobertura("ovo+azeitona")
				.montaPizza()
				.exibePizza();

		System.out.println("-----------------------");

		new Pizza.PizzaBuilder("Italiana", "m�dia")
				.defineMassa("grossa")
				.defineMolho("apimentado")
				.defineCobertura("pepperoni+salame")
				.montaPizza()
				.exibePizza();

		System.out.println("-----------------------");

		new Pizza.PizzaBuilder("Marguerita", "grande")
				.defineMassa("fina")
				.defineMolho("tomate")
				.defineCobertura("tomate+or�gano")
				.montaPizza()
				.exibePizza();
	}
}
