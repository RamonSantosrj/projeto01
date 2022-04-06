package principal;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import entities.Cliente;
import repositories.ClienteRepository;

public class Program {

	public static void main(String[] args) throws IOException {
		System.out.println(" *** CADASTRO DE CLIENTES ***");
		Scanner scanner = new Scanner(System.in);
		Cliente cliente = new Cliente();
		
//		cliente.setIdCliente(1);
//		cliente.setNome("Ramon");
//		cliente.setEmail("ramon.reis.santos@hotmail.com");
//		cliente.setCpf("186.157.987-02");
		

		System.out.println("Informe o id do cliente");
		cliente.setIdCliente(Integer.parseInt(scanner.nextLine()));
		System.out.println("Informe seu nome: ");
		cliente.setNome(scanner.nextLine());
		System.out.println("informe seu cpf: ");
		cliente.setCpf(scanner.nextLine());
		System.out.println("informe seu email: ");
		cliente.setEmail(scanner.nextLine());
		
		System.out.println("\tDADOS DO CLIENTE\n");
		System.out.println("\tID DO CLIENTE: " + cliente.getIdCliente());
		System.out.println("\tNOME.........: " + cliente.getNome());
		System.out.println("\tEMAIL........: " + cliente.getEmail());
		System.out.println("\tCPF..........: " + cliente.getCpf());
		

		ClienteRepository clienteRepository = new ClienteRepository();
		
		clienteRepository.exportar(cliente);
		
		
		
	}

}
