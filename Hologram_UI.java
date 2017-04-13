

class Hologram_UI implements ATM_UI {
    public void reqDepositAmount() {
	System.out.println("BrailleUI: req Dep Amt");
    }
    public void reqWithdrawAmount() {
	System.out.println("BrailleUI: req Wdrw Amt");
    }
    public void reqTransferAmount() {
	System.out.println("BrailleUI: req Trnsfr Amt");
    }
    public void reqPayGasAmount() {
	System.out.println("SpeechUI: req PayGas Amt");
    }
}

