

class DepositTransaction extends Transaction {
    Deposit_UI uiDevice;
    public DepositTransaction(Deposit_UI d) { uiDevice = d; }
    public void execute() {
	System.out.print("TID: " + super.getTID() + ":: " );
	uiDevice.reqDepositAmount();
    }
}

