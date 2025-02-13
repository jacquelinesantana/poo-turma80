package poo.modelo2;

import java.util.Scanner;

public class ObjetoCarro {

	public static void main(String[] args) {
		// instanciar um objeto carro
		
		/*
		Carro car = new Carro();
		car.setCor("Rosa");
		System.out.println("A cor do carro é: " + car.getCor());
		
		car.setCor("Prata");
		System.out.println("Agora a cor é: " + car.getCor());
		//car.cor = "rosa";
		car.setAno(2023);
		System.out.println("O ano do carro é: " + car.getAno());
		*/
		/*String cor, 
			String modelo, 
			String placa, 
			int ano, 
			String fabricante, 
			int velocidadeMaxima,
			float potenciaMotor, 
			int tipoCombustivel, 
			float quilometragem, 
			String chassi
			*/
		
		//objeto instanciado com todos os seus atributos
		Carro car = new Carro("Rosa","Celta","JVA 0J22",2023, "Chevrolet",
				161, 1.5f, 3, 0.0f,"1231-er3243-3432-34re");
		
		System.out.println("O modelo do carro é: "+car.getModelo());
		System.out.println("O ano do carro é: " + car.getAno());
		car.setAno(2024);
		System.out.println("O ano do carro é: " + car.getAno());
		
		
		//aqui fica o desafio de fazer o objeto car2 com os dados digitados pelo usuário
		Scanner leia = new Scanner(System.in);//instanciando objeto scanner com nome leia
		String modeloCarro, corCarro;
		System.out.println("Digite o nome do carro:");
		modeloCarro = leia.nextLine();
		System.out.println("Digite a cor do carro:");
		corCarro = leia.nextLine();
		
		/*
		 * receber do usuário todos os dados do usuário para construir o
		 * segundo objeto de carro o car2
		 * note que na mesma ordem dos argumentos do método 
		 */
		//Carro car2 = new Carro(corCarro, modeloCarro, aqui colocar os demais argumentos do usuário);
		//exibir os dados do car2 para testar se funcionou.
	}

}
