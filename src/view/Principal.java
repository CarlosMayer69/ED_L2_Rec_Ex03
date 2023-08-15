package view;

import controller.ContarParesController;

public class Principal {

	public static void main(String[] args) {

				//int[] vetor = {1,2,3,4,5,6};
				int[] vetor = {11,133,59,71,100,44};
				int tamanho = vetor.length;

				ContarParesController cp = new ContarParesController();

				int contarPares = cp.contarPares(vetor, tamanho);

				System.out.println(contarPares);

	}

}
