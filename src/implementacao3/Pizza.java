package implementacao3;

public class Pizza {

	// campos definidos pelo Garcom
	private String tipoPizza = "";
	private String tamPizza = "";
	// campos intrínsecos ao tipo de pizza
	private String massa = "";
	private String molho = "";
	private String cobertura = "";

	public String getTipoPizza() {
		return tipoPizza;
	}

	public void setTipoPizza(String tipoPizza) {
		this.tipoPizza = tipoPizza;
	}

	public String getTamPizza() {
		return tamPizza;
	}

	public void setTamPizza(String tamPizza) {
		this.tamPizza = tamPizza;
	}

	public String getMassa() {
		return massa;
	}

	public void setMassa(String massa) {
		this.massa = massa;
	}

	public String getMolho() {
		return molho;
	}

	public void setMolho(String molho) {
		this.molho = molho;
	}

	public String getCobertura() {
		return cobertura;
	}

	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	
	public void exibePizza() {
		System.out.println("Pizza: " + getTipoPizza() + "\nTamanho: " + getTamPizza() + "\nMassa: " + getMassa()
				+ "\nMolho: " + getMolho() + "\nCobertura: " + getCobertura());
	}


}
