package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.RegisterUserLogic;
import scopedata.Account;

@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String action = request.getParameter("action");
		if( action == null ) {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/u_entry_1.jsp");
		dispatcher.forward(request,response);
		}else {
			HttpSession session = request.getSession();
			Account account = (Account)session.getAttribute("LoginUser");
			RegisterUserLogic rg = new RegisterUserLogic();
			boolean r = rg.execute( account );
			String path;
			if( r == true)
				path = "WEB-INF/jsp/u_entry_3.jsp";
			else
				path = "WEB-INF/jsp/registerErr.jsp";
			RequestDispatcher dispatcher =
					request.getRequestDispatcher( path );
			dispatcher.forward(request,response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");


		HttpSession session = request.getSession();

		Account account = new Account( id , pass);
		session.setAttribute("LoginUser", account);

		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/u_entry_2.jsp");
		dispatcher.forward(request, response);
	}

}
