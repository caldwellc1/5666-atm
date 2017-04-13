
abstract class Transaction {
    protected int transactionID;
    private static int currTID = 1001;
    public Transaction() {
	transactionID = ++currTID;
    }
    public int getTID() {
	return transactionID;
    }
    
    abstract void execute();
}


