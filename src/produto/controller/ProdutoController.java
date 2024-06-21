package produto.controller;

import java.util.ArrayList;
import java.util.Optional;
import produto.model.Produto;
import produto.repository.ProdutoRepository;

public class ProdutoController implements ProdutoRepository {

	private ArrayList<Produto> listaProdutos = new ArrayList<Produto>();
	int numero = 0;

	@Override
	public void procurarPorSku(int numero) {
		Optional<Produto> skuBusca = buscarNaCollection(numero);

		if (skuBusca.isPresent()) {
			Produto produto = skuBusca.get();
			produto.visualizar();
		} else {
			System.out.println("\nA SKU " + numero + " não foi encontrada!");
		}
	}
	private Optional<Produto> buscarNaCollection(int numero) {
		for (int i = 0; i < listaProdutos.size(); i++) {
			if (numero == listaProdutos.get(i).getNumero()) {
				Optional<Produto> produtooptional = Optional.of(listaProdutos.get(i));
				return produtooptional;
			}
		}
		Optional<Produto> optionalvazio = Optional.empty();
		return optionalvazio;
	}

	@Override
	public void listarTodos() {
		for (var produto : listaProdutos)
			produto.visualizar();

	}

	@Override
	public void cadastrar(Produto produto) {
		listaProdutos.add(produto);
		System.out.println("\nO produto sku " + produto.getNumero() + " foi cadastrado com sucesso");
	}

	@Override
	public void atualizar(Produto produto) {

		Optional<Produto> buscaProduto = buscarNaCollection(produto.getNumero());

		if (buscaProduto.isPresent()) {
			listaProdutos.set(listaProdutos.indexOf(buscaProduto.get()), produto);
		}else 
			System.out.println("O produto de sku " + numero + "não foi encontrado!");

	}

	@Override
	public void deletar(int numero) {

		Optional<Produto> produto = buscarNaCollection(numero);

		if(produto.isPresent()) {
			if (listaProdutos.remove(produto.get()) == true)
				System.out.println("O produto de sku " + numero + " foi excluído com sucesso!");
		} else
			System.out.println("O produto de sku " + numero + "não foi encontrado!");

	}


	public int gerarNumero() {
		return ++ numero;
	}

}
