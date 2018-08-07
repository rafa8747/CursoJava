package com.abctreinamentos;

import java.util.List;
import java.util.Scanner;

public class CursoApp {

	public static void Curso() {

		try {

			Scanner entrada = new Scanner(System.in);
			int opcao = 0;
			long cdcurso, valor;
			CursoDAO dao = new CursoDAO();

			String nome, url;

			while (opcao != 6) {

				System.out.println("Sistema de Gerenciamento de Cursos");
				System.out.println("====================================");
				System.out.println("Digite [1] para Consultar Todos os Cursos");
				System.out.println("Digite [2] para Consultar um Curso Específico");
				System.out.println("Digite [3] para Cadastrar um Novo Curso");
				System.out.println("Digite [4] para Alterar um Curso");
				System.out.println("Digite [5] para Excluir um Curso");
				System.out.println("Digite [6] para Sair");
				System.out.println("====================================");

				opcao = entrada.nextInt();

				switch (opcao) {

				case 1: // Consultar todos os Cursos
				{
					System.out.println("[1] Consultar Todos");
					List<Curso> cursos = dao.findAll();
					cursos.forEach(System.out::println);
					break;
				}

				case 2: // Consultar
				{
					System.out.println("[2] Consultar um Curso Escpecífico");
					System.out.println("Informe o CDCURSO: ");
					cdcurso = entrada.nextLong();
					System.out.println(dao.find(cdcurso));
					break;
				}

				case 3: // Cadastrar
				{
					System.out.println("[3] Cadastrar um Novo Curso");
					System.out.println("Informe o CDCURSO à ser Cadastrado: ");
					cdcurso = entrada.nextLong();
					entrada.nextLine(); // esvaziar o buffer do teclado
					System.out.println("Favor informar o Nome:  ");
					nome = entrada.nextLine();
					System.out.println("Favor informar o Valor: ");
					valor = entrada.nextLong();
					entrada.nextLine(); // esvaziar o buffer do teclado
					System.out.println("Informe a URL: ");
					url = entrada.nextLine();
					Curso Curso = new Curso(cdcurso, nome, valor, url);
					dao.persist(Curso);
					break;
				}

				case 4: // Alterar
				{
					System.out.println("[4] Alterar um Curso");
					System.out.println("Informe o CDCURSO à ser Alterado: ");
					cdcurso = entrada.nextLong();
					entrada.nextLine(); // esvaziar o buffer do teclado
					System.out.println("Favor informar o Nome:  ");
					nome = entrada.nextLine();
					System.out.println("Favor informar o Valor: ");
					valor = entrada.nextLong();
					entrada.nextLine(); // esvaziar o buffer do teclado
					System.out.println("Informe a URL: ");
					url = entrada.nextLine();
					Curso Curso = new Curso(cdcurso, nome, valor, url);
					dao.merge(Curso);
					break;
				}

				case 5: // Excluir
				{
					System.out.println("[5] Excluir um Curso");
					System.out.println("Informe o CDCURSO à ser Excluído: ");
					cdcurso = entrada.nextLong();
					Curso Curso = dao.find(cdcurso);
					dao.delete(Curso);
					break;
				}

				case 6: // Sair
				{
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
