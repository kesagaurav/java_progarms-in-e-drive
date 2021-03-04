
public class Deposit  extends  Exception{

	private String errormsg="";

	public Deposit(String msg) {
		this.errormsg = msg;
	}

	@Override
	public String toString() {
		return "Deposit [errormsg=" + errormsg + "]";
	}
	



}
