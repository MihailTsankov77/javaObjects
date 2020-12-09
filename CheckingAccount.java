package Exercise;

import klas11g.Account;

public class CheckingAccount extends Account{

	private double OverDraft;
	
	public CheckingAccount(int _id, double _balance, double overDraft) {
		super(_id, _balance);
		this.setOverDraft(overDraft);
	}
	
	public double getOverDraft() {
		return OverDraft;
	}
	
	private void setOverDraft(double overDraft) {
		OverDraft = overDraft;
	}
	
	@Override
	public void withdraw(double _withdraw) {
		if(super.getBalance() > this.OverDraft) {
			super.setBalance(super.getBalance() - _withdraw);
		}
		
	}
	
}
