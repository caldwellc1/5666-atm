

class TransferTransaction extends Transaction {
    Transfer_UI uiDevice;
    public TransferTransaction(Transfer_UI d) { uiDevice = d; }
    public void execute() {
	System.out.print("TID: " + super.getTID() + ":: " );
	uiDevice.reqTransferAmount();
    }
}

