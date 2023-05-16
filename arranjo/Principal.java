package arranjo;
import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		int tabela[][] = new int [2][3];
		Scanner in = new Scanner( System.in );
		//2 linhas e 3 colunas
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.println("Entre com o valor da tabela[" + linha + "][" + coluna + "]:" );			
				tabela[linha][coluna] = Integer.parseInt(in.nextLine());	
				System.out.println();
			}
		}
		
		for (int linha = 0; linha < 2; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				
				System.out.print(tabela[linha][coluna] + " ");
			}
			System.out.println();
		}
		
	}

}
