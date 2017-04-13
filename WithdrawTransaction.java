

class WithdrawTransaction extends Transaction {
    Withdraw_UI uiDevice;
    public WithdrawTransaction(Withdraw_UI d) { uiDevice = d; }
    public void execute() {
	System.out.print("TID: " + super.getTID() + ":: " );
	uiDevice.reqWithdrawAmount();
	uiDevice.verifyWithdrawAmount();
    }
}

