package implementacao2;

public class ProdutoPizza {

	// campos definidos pelo Garcom
	private String tipoPizza = "";
	private String tamPizza = "";
	// campos intrínsecos ao tipo de pizza
	private String massa = "";
	private String molho = "";
	private String cobertura = "";

	public void defineTipoPizza(String tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	public void defineTamPizza(String tamPizza) {
		this.tamPizza = tamPizza;
	}

	public void defineMassa(String massa) {
		this.massa = massa;
	}

	public void defineMolho(String molho) {
		this.molho = molho;
	}

	public void defineCobertura(String cobertura) {
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

}
