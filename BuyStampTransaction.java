
class BuyStampTransaction extends Transaction {
    BuyStamp_UI uiDevice;
    public BuyStampTransaction(BuyStamp_UI d) { uiDevice = d; }
    public void execute() {
	System.out.print("TID: " + super.getTID() + ":: " );
	uiDevice.reqBuyStampAmount();
    }
}

