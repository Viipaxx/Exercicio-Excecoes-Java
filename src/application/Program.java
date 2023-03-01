package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
	public static void main(String[] args){
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			
			System.out.print("Number: ");
			int number = sc.nextInt();
			sc.nextLine();
			
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			
			System.out.print("Balance: $ ");
			double balance = sc.nextDouble();

			System.out.print("Withdraw limit: $ ");
			double withdrawLimit = sc.nextDouble();
			
			Account ac = new Account(number, holder, balance, withdrawLimit);
			
			System.out.print("Valor para saque: $");
			ac.withdraw(sc.nextDouble());
			
			System.out.printf("Saldo atual: $ %.2f", ac.getBalance());
		} catch (DomainException e) {
		
			System.out.println("Erro: " + e.getMessage());
			
		} catch (RuntimeException e) {
			
			System.out.println("Ocorreu um erro inesperado!");
			
		}
		
		sc.close();
	}
}
