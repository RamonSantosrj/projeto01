package repositories;

import java.io.File;
import java.io.PrintWriter;

import entities.Cliente;

public class ClienteRepository {


		//método para gravar os dados de um cliente em arquivo
		public void exportar(Cliente cliente) {
			
			try {
				
				PrintWriter print = new PrintWriter(new File("C:\\\\Users\\\\ramon\\\\Desktop\\\\backup\\\\Aula Coti Informatica - java web\\\\arquivo.txt"));
				
				print.write("\nID DO CLIENTE..: " + cliente.getIdCliente());
				print.write("\nNOME...........: " + cliente.getNome());
				print.write("\nEMAIL..........: " + cliente.getEmail());
				print.write("\nCPF............: " + cliente.getCpf());
			
				print.flush(); //salvar
				print.close(); //fechar
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

