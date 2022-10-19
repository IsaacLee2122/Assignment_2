class Account {
	double balance;

	public Account() {
		this.balance=0.0;
	}
	
	public void deposit(double amt) {
		this.balance+=amt;
	}
	public void withdraw(double amt) {
		if(amt > this.balance) {
			System.out.println("Not enough balance");
			return ;
		}
		this.balance-=amt;
	}
	public double getBalance() {
		return balance;
	}	
}
class AccountHolder {
	int ID;
	String address;
	public int nextID() {
		return 0;//since the ques ask not to give def
	}
	
}

class IndividualHolder extends AccountHolder{
	String name;
	String SSN;
	
}

class CorporateHolder extends AccountHolder {
	String contact;
}
