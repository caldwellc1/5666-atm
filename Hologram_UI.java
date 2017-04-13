

class Hologram_UI implements ATM_UI {
    public void reqDepositAmount() {
	System.out.println("HologramUI: req Dep Amt");
    }
    public void reqWithdrawAmount() {
	System.out.println("HologramUI: req Wdrw Amt");
    }
    public void reqTransferAmount() {
	System.out.println("HologramUI: req Trnsfr Amt");
    }
    public void reqPayGasAmount() {
	System.out.println("HologramUI: req PayGas Amt");
    }
	public void reqBuyStampAmount() {
	System.out.println("HologramUI: req BuyStamp Amt");
    }
	public void confirmWithdrawAmt() {
	System.out.println("HologramUI: confirm Wdrw Amt");
    }
	public void verifyDepAmount() {
	System.out.println("HologramUI: verify Dep Amt");
    }
}

