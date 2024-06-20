package produto.model;

public abstract class Produto {

	int numero;
	int tipo;
	String nomeprod;
	float preco;


	public Produto(int numero, int tipo, String nomeprod, float preco) {
		this.numero = numero;
		this.tipo = tipo;
		this.nomeprod = nomeprod;
		this.preco = preco;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getNomeprod() {
		return nomeprod;
	}
	public void setNomeprod(String nomeprod) {
		this.nomeprod = nomeprod;
	}
	public float getPreco() {
		return preco;
	}
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public void visualizar() {

		String tipo = "";

		switch(this.tipo) {
		case 1:
			tipo = "Maquiagem";
			break;
		case 2:
			tipo = "Skin Care";
			break;
		}

		System.out.println("\n\n________________________♥____________________________");
		System.out.println("Dados do produto:");
		System.out.println("________________________♥____________________________");
		System.out.println("Sku do produto: " + this.numero);
		System.out.println("Tipo do produto: " + tipo);
		System.out.println("Produto: " + this.nomeprod);
		System.out.println("Preço: " + this.preco);

	}

	public void atualizarPreco(float novoPreco) {
		this.preco = novoPreco;

	}
}
