package implementacao;

public class Pizza {
	
	// campos obrigatórios
	private String tipoPizza = "";
	private String tamPizza = "";
	// campos opcionais
	private String massa = "";
	private String molho = "";
	private String cobertura = "";

	private Pizza(PizzaBuilder builder) {
		this.defineTipoPizza(builder.getTipoProdutoPizza());
		this.defineTamPizza(builder.getTamPizza());
		this.defineMassa(builder.getMassa());
		this.defineMolho(builder.getMolho());
		this.defineCobertura(builder.getCobertura());
	}

	protected void defineTipoPizza(String tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	protected void defineTamPizza(String tamPizza) {
		this.tamPizza = tamPizza;
	}

	protected void defineMassa(String massa) {
		this.massa = massa;
	}

	protected void defineMolho(String molho) {
		this.molho = molho;
	}

	protected void defineCobertura(String cobertura) {
		this.cobertura = cobertura;
	}

	public String getTipoProdutoPizza() {
		return tipoPizza;
	}

	public String getTamPizza() {
		return tamPizza;
	}

	public String getMassa() {
		return massa;
	}

	public String getMolho() {
		return molho;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void exibePizza() {
		System.out.println("Pizza: " + getTipoProdutoPizza() + "\nTamanho: " + getTamPizza() + "\nMassa: " + getMassa()
				+ "\nMolho: " + getMolho() + "\nCobertura: " + getCobertura());
	}

	public static class PizzaBuilder {
		
		// campos obrigatórios
		private String tipoPizza = "";
		private String tamPizza = "";
		// campos opcionais
		private String massa = "";
		private String molho = "";
		private String cobertura = "";
		
		public PizzaBuilder(String tipoProdutoPizza, String tamPizza) {
			this.defineTipoPizza(tipoProdutoPizza);
			this.defineTamPizza(tamPizza);
		}

		protected void defineTipoPizza(String tipoPizza) {
			this.tipoPizza = tipoPizza;
		}

		protected void defineTamPizza(String tamPizza) {
			this.tamPizza = tamPizza;
		}
		
		public PizzaBuilder defineMassa(String massa) {
			this.massa = massa;
			return this;
		}
		
		public PizzaBuilder defineMolho(String molho) {
			this.molho = molho;
			return this;
		}

		public PizzaBuilder defineCobertura(String cobertura) {
			this.cobertura = cobertura;
			return this;
		}

		protected String getTipoProdutoPizza() {
			return tipoPizza;
		}

		protected String getTamPizza() {
			return tamPizza;
		}

		protected String getMassa() {
			return massa;
		}

		protected String getMolho() {
			return molho;
		}

		protected String getCobertura() {
			return cobertura;
		}

		public Pizza montaPizza() {
			return new Pizza(this);
		}

	}
}