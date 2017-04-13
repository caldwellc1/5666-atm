
public class ATM {
    public static void main(String[] args) {
	ATM_UI theDevice = null;
	Transaction t = null;
	
	if (args.length != 2) {
	    System.out.println("usage: java ATM dev transaction");
	    System.out.println("\tdev = {screen, braille, speech, hologram}");
	    System.out.println("\ttransaction = {deposit, withdraw}");
	    System.out.println();
	    System.exit(0);
	}
	String device = args[0];
	String transaction = args[1];
	if ("screen".equals(device)) theDevice = new Screen_UI();
	else if ("braille".equals(device)) theDevice = new Braille_UI();
	else if ("speech".equals(device)) theDevice = new Speech_UI();
	else if ("hologram".equals(device)) theDevice = new Hologram_UI();
	else {
	    System.out.println("Unknown device name: " + device);
	    System.out.println();
	    System.exit(0);
	}

	
	if ("deposit".equals(transaction))
	    t = new DepositTransaction(theDevice);
	else if ("withdraw".equals(transaction))
	    t = new WithdrawTransaction(theDevice);
	else if ("transfer".equals(transaction))
	    t = new TransferTransaction(theDevice);
	else if ("paygas".equals(transaction))
	    t = new PayGasTransaction(theDevice);
	else {
	    System.out.println("Unknown transaction name: " + transaction);
	    System.out.println();
	    System.exit(0);
	}

	System.out.println("Getting ready to execute...");
	t.execute();
	System.out.println("Have a wonderful day.");
	System.out.println();
    }
}
