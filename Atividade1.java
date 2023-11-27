
import java.util.Scanner;

public class Atividade1 { // exercicio atividades fun��es

	public static void main(String[] args) {

		Scanner console = new Scanner(System.in);

		double numNegativo = 0; // variavel contar n negativos
		double somaPositivo = 0; // vari�vel somar n positivos
		int i; // contador
		int numLeitura; // ir� armazenar o que for digitado

		for (i = 1; i <= 8; i++) { // i++ conta de 1 em 1. For serve para contador
			System.out.println("Digite o n�mero: " + i);// enxergar a posi��o do contador
			numLeitura = Integer.parseInt(console.nextLine());

			if (numLeitura > 0) {
				somaPositivo = somaPositivo + numLeitura;

			} else {
				if (numLeitura < 0) {
					numNegativo++; // ++ = conta de 1 em 1
				}
			}
			console.close();
		}

		System.out.println("Soma dos n�meros positivos: " + somaPositivo);
		System.out.println("N�meros negativos: " + numNegativo);
	}
}