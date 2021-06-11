package entities;

import java.util.Scanner;

public class Metodos {
	
	Scanner sc = new Scanner (System.in);

	private String nome;
	private int conta;
	private double saldo;

	
	//Metodo contrutor
	
	public Metodos() {
		
	}
	
	public Metodos (String nome, int conta) {
		this.nome = nome;
		this.conta = conta;
	}
	
	
	public Metodos(String nome, int conta, double depositoInicial) {
		super();
		this.nome = nome;
		this.conta = conta;
		Deposito(depositoInicial);
	}



	public Metodos(double saldo) {
		
		this.saldo = saldo;
	}


	public String getNome() {
		return nome;
	}
	
	public int getConta() {
		return conta;
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
		
	public double getSaldo() {
		return saldo;
	}

	public double Saque(double saque) {
		return saldo = saldo- saque - 5.0;	
	}
		
	
	public void Deposito(double deposito) {
		saldo = saldo + deposito;
	}
	
	public void Addconta() {
				System.out.print("Nome do Cliente: ");
				String nome = sc.next();
				System.out.print("Numero da conta: ");
				int conta = sc.nextInt();
				
		
				}
		
	}

