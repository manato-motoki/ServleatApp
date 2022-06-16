package scopedata;

import java.io.Serializable;

public class Account implements Serializable {
	private String id;
	private String pass;

	public Account() {}
	public Account( String _id , String _pass) {
		id = _id; pass = _pass;
	}
	public String getId() { return id; }
	public String getPass() { return pass;}
}
