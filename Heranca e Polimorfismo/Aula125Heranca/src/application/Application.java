package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Application {

	public static void main(String[] args) {
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002,"Maria", 0.0, 500.0);
		
		/*UPCASTING
		*Account recebe BusinessAccount
		*Atribuindo um objeto da sub classe para super classe
		*
		*/
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account acc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		
		/*DOWCASTING
		*CONVERTER UM OBJETO DA SUPERCLASSPARA SUBCLASSE
		*
		*/
		BusinessAccount acc4 = (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		/*Se acc3 for instanciavel por BusinessAccount
		 * acc3 � do tipo SavingsAccounts*/
		if(acc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)acc3;
			acc5.loan(200.0);
			System.out.println("Empestimo!");
		}
		if(acc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)acc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		//testando a sobreposi��o de metodos em saque
		System.out.println("//testando a sobreposi��o de metodos em saque");
		Account acc10 = new Account(1001, "Alex", 1000.0);
		acc10.withdraw(200.0);
		System.out.println(acc10.getBalance());
		
		Account acc20 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
		acc20.withdraw(200.0);
		System.out.println(acc20.getBalance());
		
		Account acc30 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc30.withdraw(200.0);
		System.out.println(acc30.getBalance());
		//testando POLIMORFISMO
		System.out.println("//testando POLIMORFISMO");
		Account x = new Account(1020, "Alex", 1000.0);
		Account y = new SavingsAccount(1023, "Maria", 1000.0, 0.01);
		x.withdraw(50.0);
		y.withdraw(50.0);
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());

	}

}
