package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Metodos;
import funcao.Saque;
public class Banco_Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Saque valor = new Saque();
		
		System.out.println("Bem vindo o Banco Money de Montão");
		System.out.println();
		
		int opcao;
		double saque;
		
		Metodos metodo = new Metodos();
		
		do {
		System.out.println("Opções de operações ");
		System.out.println();
		System.out.println("Opção 1 : Deposito");
		System.out.println("Opção 2 : Saldo");
		System.out.println("Opção 3 : Saque");
		System.out.println("Opção 0 : Sair");
		System.out.println();
		System.out.print("Selecione a operação que deseja realizar:");
		
		opcao = sc.nextInt();
		
		switch (opcao) {
		
		
		case 1: 
			System.out.print("Digite o Valor para deposito: ");
			double deposito = sc.nextDouble(); 
			metodo.Deposito(deposito);
			System.out.println();
			System.out.print("Deseja outra operação? (s/n)");
			char outraOperacao = sc.next().charAt(0);
		 	if(outraOperacao == 'n')
		 		opcao = 0;
		 	System.out.println();
			break;
		case 2: 
			System.out.println(metodo.getSaldo());
			System.out.println();
			System.out.print("Deseja outra operação? (s/n)");
			outraOperacao = sc.next().charAt(0);
		 	if(outraOperacao == 'n')
		 		opcao = 0;
		 	System.out.println();
		 	break;
		case 3: 
			System.out.print("Informe o valor para saque: ");
			saque = sc.nextDouble();
			metodo.Saque (saque);
			
			//chamada direto da classe "Saque" para verificar quantidade de notas
			valor.saque(saque);
			
			System.out.println();
			System.out.print("Deseja outra operação? (s/n)");
			outraOperacao = sc.next().charAt(0);
		 	if(outraOperacao == 'n')
		 		opcao = 0;
		 	System.out.println();
			break;
		}
		

		}while(opcao != 0);
		
		System.out.println();
		System.out.println("Operacao Encerrada");

		sc.close();
	}
}