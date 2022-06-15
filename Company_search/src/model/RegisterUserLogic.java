package model;

import dao.RegisterDAO;
import scopedata.Account;

public class RegisterUserLogic {
	public boolean execute ( Account account ) {
		RegisterDAO dao = new RegisterDAO();

		int r = dao.execute( account );
		if( r == 0 ) return false;
		return true;
	}
}
