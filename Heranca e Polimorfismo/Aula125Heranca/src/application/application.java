package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class application {

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
		 * acc3 é do tipo SavingsAccounts
		 */
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

	}

}
