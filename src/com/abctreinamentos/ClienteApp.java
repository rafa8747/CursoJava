package com.abctreinamentos;

import java.util.Scanner;

public class ClienteApp {

	public static void main(String[] args) {

		try {

			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			long cpf;
			ClienteDAO dao = new ClienteDAO();

			String nome, email;

			while (opcao != 6) {

				System.out.println("Sistema de Gerenciamento de Clientes");
				System.out.println("====================================");
				System.out.println("Digite [1] para Consultar Todos os Clientes");
				System.out.println("Digite [2] para Consultar um Cliente Específico");
				System.out.println("Digite [3] para Cadastrar um Novo Cliente");
				System.out.println("Digite [4] para Alterar um Cliente");
				System.out.println("Digite [5] para Excluir um Cliente");
				System.out.println("Digite [6] para Sair");
				System.out.println("====================================");

				opcao = entrada.nextInt();

				switch (opcao) {

				case 1: // Consultar todos os clientes
				{
					System.out.println("[1] Consultar Todos");
					// consultarTodos();
					break;
				}

				case 2: // Consultar
				{
					System.out.println("[2] Consultar um Cliente Escpecífico");
					System.out.println("Informe o CPF: ");
					cpf = entrada.nextLong();
					Cliente cliente = dao.find(cpf);
					System.out.println(cliente.toString());
					break;
				}

				case 3: // Cadastrar
				{
					System.out.println("[3] Cadastrar um Novo Cliente");
					System.out.println("Informe o CPF à ser Cadastrado: ");
					cpf = entrada.nextLong();
					entrada.nextLine(); // esvaziar o buffer do teclado
					System.out.println("Favor informar o Nome:  ");
					nome = entrada.nextLine();
					System.out.println("Favor informar o E-mail: ");
					email = entrada.nextLine();
					Cliente cliente = new Cliente(cpf, nome, email);
					dao.persist(cliente);
					break;
				}

				case 4: // Alterar
				{
					System.out.println("[4] Alterar um Cliente");
					System.out.println("Informe o CPF do Cliente à ser Alterado: ");
					cpf = entrada.nextLong();
					entrada.nextLine(); // esvaziar o buffer do teclado
					System.out.println("Favor informar o Nome:  ");
					nome = entrada.nextLine();
					System.out.println("Favor informar o E-mail: ");
					email = entrada.nextLine();
					Cliente cliente = new Cliente(cpf, nome, email);
					dao.merge(cliente);
					break;
				}

				case 5: // Excluir
				{
					System.out.println("[5] Excluir um Cliente");
					System.out.println("Informe o CPF do Cliente à ser Excluído: ");
					cpf = entrada.nextLong();
					Cliente cliente = dao.find(cpf);
					dao.delete(cliente);
					break;
				}

				case 6: // Sair
				{
					System.out.println("Encerrando o Sistema... ");
					break;
				}

				} // switch

			} // while
			entrada.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // Main
} // Class