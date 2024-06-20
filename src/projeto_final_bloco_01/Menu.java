package projeto_final_bloco_01;

import java.util.Scanner;
import produto.model.Produto;

public class Menu {

	public static void main(String[] args) {
		
		//Teste da classe Menu
		Produto p1 = new Produto(001, 1, "Blush", 25.0f);
		p1.visualizar();
		p1.atualizarpreco(12000.0f);
		p1.visualizar();
		p1.atualizarpreco(30.0f);

		Scanner leia = new Scanner(System.in);

		int opcao;
		
		
		while (true) {

			System.out.println("________________________♥____________________________");
			System.out.println("                                                     ");
			System.out.println("                E-commerce JavaBeauty                ");
			System.out.println("                                                     ");
			System.out.println("_____________________________________________________");
			System.out.println("                                                     ");
			System.out.println("            1 - Cadastrar produto                    ");
			System.out.println("            2 - Listar todos os produtos             ");
			System.out.println("            3 - Buscar produto por sku            ");
			System.out.println("            4 - Atualizar dados do produto           ");
			System.out.println("            5 - Apagar produto                       ");
			System.out.println("            6 - Sair                                 ");
			System.out.println("                                                     ");
			System.out.println("________________________♥____________________________");
			System.out.println("Digite a opção desejada:                             ");
			System.out.println("                                                     ");

			opcao = leia.nextInt();

			if (opcao == 6) {
				System.out.println("\n JavaBeauty ♥ Beleza codificada para você!");
				leia.close();
				System.exit(0);
			}

			switch (opcao) {
				case 1:
					System.out.println("Cadastrar produto\n\n");

					break;
				case 2:
					System.out.println("Listar todos os produtos\n\n");

					break;
				case 3:
					System.out.println("Consultar dados do produto - por sku\n\n");

					break;
				case 4:
					System.out.println("Atualizar dados do produto\n\n");

					break;
				case 5:
					System.out.println("Apagar o produto\n\n");

					break;
				default:
					System.out.println("\nOpção Inválida!\n");
					break;
			}
		}
	}
		

	}
