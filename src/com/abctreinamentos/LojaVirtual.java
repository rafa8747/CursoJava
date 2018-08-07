package com.abctreinamentos;

import java.util.Scanner;

public class LojaVirtual {

	public static void main(String[] args) {

		try {

			Scanner entrada = new Scanner(System.in);
			int opcao = 0;

			while (opcao != 6) {

				System.out.println("Sistema de Gerenciamento");
				System.out.println("====================================");
				System.out.println("Digite [1] para acessar a área de Clientes");
				System.out.println("Digite [2] para acessar a área de Cursos");
				System.out.println("Digite [3] para acessar a área de Pagamentos");
				System.out.println("Digite [4] para Sair");
				System.out.println("====================================");

				opcao = entrada.nextInt();

				switch (opcao) {

				case 1: // Consultar todos os clientes
				{
					ClienteApp.Cliente();
					break;
				}

				case 2: // Consultar
				{
					CursoApp.Curso();
					break;
				}

				case 3: // Cadastrar
				{
					PagamentoApp.Pagamento();
					break;
				}
				case 4: // Sair
				{
					System.out.println("Encerrando o Sistema... ");
					return;
				}

				} // switch

			} // while
			entrada.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // Main
}