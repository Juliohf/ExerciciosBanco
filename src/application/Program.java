package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		Conta acc;

		System.out.println("Enter account number:");
		int conta = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter account name:");
		String nome = sc.nextLine();		

		
		System.out.println("Is there na initial deposit (y/n)?");
		char x = sc.next().charAt(0);
		if (x == 'y') {
			System.out.println("Enter initial deposit value:");
			double deposito = sc.nextDouble();
			acc = new Conta(nome, conta, deposito);
		} else {
			acc = new Conta(nome, conta);
		}


		
		System.out.println(acc);
		
		System.out.println("Enter a deposit value:");
		double val = sc.nextDouble();
		acc.dep(val);
		
		System.out.println(acc);
		
		System.out.println("Enter a withdraw value:");
		double saq = sc.nextDouble();
		acc.saque(saq);
		
		System.out.println(acc);
		
		
		sc.close();
	}

}
