package projeto_final_bloco_01;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import produto.util.Cores;

import produto.controller.ProdutoController;
import produto.model.Maquiagem;

public class Menu {

	public static void main(String[] args) {

		ProdutoController produtos = new ProdutoController();

		Scanner leia = new Scanner(System.in);
		int opcao, tipo, numero;
		String nomeprod;
		float preco;


		while (true) {

			System.out.println(Cores.TEXT_CYAN + Cores.ANSI_BLACK_BACKGROUND + 
					"________________________♥____________________________");
			System.out.println("                                                     ");
			System.out.println("                E-commerce JavaBeauty                ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto por sku               ");
			System.out.println("            4 - Atualizar dados do produto           ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("________________________♥____________________________");
			System.out.println("Digite a opção desejada:                             ");
			System.out.println("                                                     " + Cores.TEXT_RESET);

			try{

				opcao = leia.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}

			if (opcao == 6) {
				System.out.println(Cores.TEXT_WHITE_BOLD + "\n JavaBeauty ♥ Beleza codificada para você!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
			case 1:
				System.out.println(Cores.TEXT_WHITE + "Cadastrar produto\n\n");

				System.out.println("Digite o nome do produto:");
				leia.nextLine();
				nomeprod = leia.nextLine();


				do {
					System.out.println("Digite o tipo de produto (1 Make ou 2 Skin):");
					tipo = leia.nextInt();
				}while(tipo < 1 || tipo > 2);

				System.out.println("Digite o valor do produto (R$)");
				preco = leia.nextFloat();

				produtos.cadastrar(new Maquiagem (produtos.gerarNumero(), tipo, nomeprod, preco));

				keyPress();
				break;
			case 2:
				System.out.println(Cores.TEXT_WHITE + "Listar todos os produtos\n\n");
				produtos.listarTodos();

				keyPress();
				break;
			case 3:
				System.out.println(Cores.TEXT_WHITE + "Consultar dados do produto - por sku\n\n");

				System.out.println("Digite a sku do produto:");
				numero = leia.nextInt();
				produtos.procurarPorSku(numero);

				keyPress();
				break;
			case 4:
				System.out.println(Cores.TEXT_WHITE + "Atualizar dados do produto\n\n");
				System.out.println("Digite o sku do produto:");
				int skuchange = leia.nextInt();

				System.out.println("Digite o nome do produto:");
				leia.nextLine();
				nomeprod = leia.nextLine();			

				do {
					System.out.println("Digite o tipo de produto (1 Make ou 2 Skin):");
					tipo = leia.nextInt();
				}while(tipo < 1 || tipo > 2);

				System.out.println("Digite o valor do produto (R$)");
				preco = leia.nextFloat();

				produtos.atualizar(new Maquiagem (skuchange, tipo, nomeprod, preco));

				keyPress();
				break;
			case 5:
				System.out.println(Cores.TEXT_WHITE + "Apagar o produto\n\n");

				System.out.println("Digita a sku do produto:");
				numero = leia.nextInt();

				produtos.deletar(numero);

				keyPress();
				break;
			default:
				System.out.println(Cores.TEXT_RED_BOLD + "\nOpção Inválida!\n" + Cores.TEXT_RESET);
				keyPress();
				break;
			}
		}
	}

	private static void keyPress() {

		try {
			System.out.println("\nPressione Enter para continuar...");
			System.in.read();
		} catch (IOException e) {
			System.out.println("Você pressionou uma tecla diferente de enter!");
		}	

	}


}
