package entities;

public class BusinessAccount extends Account {
	private Double loanLimit; //emprestimo limite
	
	public BusinessAccount() {
		
	}
	
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}





	public void loan(Double amount) {
		 
	 }

	

}
