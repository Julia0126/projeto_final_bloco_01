package produto.model;

public class Skincare extends Produto {

	float preco;

	public Skincare(int numero, int tipo, String nomeprod, float preco) {
		super(numero, tipo, nomeprod, preco);

	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

}
