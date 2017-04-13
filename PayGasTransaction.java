

class PayGasTransaction extends Transaction {
    PayGas_UI uiDevice;
    public PayGasTransaction(PayGas_UI d) { uiDevice = d; }
    public void execute() {
	System.out.print("TID: " + super.getTID() + ":: " );
	uiDevice.reqPayGasAmount();
    }
}

