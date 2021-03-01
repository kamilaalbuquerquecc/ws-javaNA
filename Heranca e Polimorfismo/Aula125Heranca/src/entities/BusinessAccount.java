package entities;
//conta empresarial
public class BusinessAccount extends Account {
	private Double loanLimit; //emprestimo limite
	
	public BusinessAccount() {
		super();//executar a logica do construtor da classe base/super classe
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance); //construtor da super classe
		this.loanLimit = loanLimit;
	}
	

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= loanLimit) {
			balance+=amount -10;
		} 
	 }
	
	/*Exemplo: suponha que, na classe BusinessAccount, a regra para saque seja realizar o
	 * saque normalmente da superclasse, e descontar mais 2.0.*/
	@Override
	public void withdraw (Double amount) {
		super.withdraw(amount); //exemplo de usar super
		balance -= 2.0;
	}

	

}
