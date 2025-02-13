package poo.cliente;

public class ObjetoCliente {

	public static void main(String[] args) {
		// instanciando o objeto cliente
		Cliente cliente1 = new Cliente("Mariana", "Mari@gmail.com",
				"1234567890", "Rua das Ruas n 123", "123456789789", 
				"123456acv"
				, "123456", "complemento");
		
		//saida do dado do cliente -> endereço
		System.out.println("Vamos entregar suas tralhas  no endereço: "
				+ cliente1.getEndereco() );
		
		//alterando o dado endereço
		cliente1.setEndereco("Avenida grandona 789");
		
		//print do dado atualizado do endereço
		System.out.println("Vamos entregar suas tralhas  no endereço: "
				+ cliente1.getEndereco() );
	}

}
