package produto.repository;

import produto.model.Produto;

public interface ProdutoRepository {
	
	// CRUD do Produto
	public void procurarPorSku(int numero);
	public void listarTodos();
	public void cadastrar(Produto produto);
	public void atualizar(Produto produto);
	public void deletar(int numero);
	
	// Método precificar
	public void precificar(int numero, float valor);

}
