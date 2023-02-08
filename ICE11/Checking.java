@SuppressWarnings(value = { "unused" })
public class Checking extends Account implements Depositable {
	private Check [] checks;
    
    public Checking(){super();checks=null;}
    
	public Checking(String name, int accountNum, double balance, String address, Check[] checks){
	    super(name, accountNum, balance, address);
	    this.checks = checks;
	}
}