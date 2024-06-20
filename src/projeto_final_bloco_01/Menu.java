package projeto_final_bloco_01;

import java.util.InputMismatchException;
import java.util.Scanner;

import produto.model.Maquiagem;
import produto.model.Produto;
import produto.model.Skincare;

public class Menu {

	public static void main(String[] args) {

		
        Produto p1 = new Maquiagem(1, 1, "Base Líquida", 25.99f);
        
        p1.visualizar();        
        p1.atualizarPreco(59.99f);        
        p1.visualizar();

        
        Produto p2 = new Skincare(1, 2, "Hidratante", 30.99f);
        
        p2.visualizar();        
        p2.atualizarPreco(75.00f);        
        p2.visualizar();
        
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

			try{
			
				opcao = leia.nextInt();
			}
			catch (InputMismatchException e) {
				System.out.println("\nDigite valores inteiros!");
				leia.nextLine();
				opcao = 0;
			}
			
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
