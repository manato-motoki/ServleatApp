package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import scopedata.Login;

@WebServlet("/UserServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher dispatcher =
				request.getRequestDispatcher("WEB-INF/jsp/ulogin.jsp");
		dispatcher.forward(request,response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String path;
		request.setCharacterEncoding("UTF-8");
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		HttpSession session = request.getSession();
		Login login = new Login(id , pass);
		session.setAttribute("login", login);

		LoginLogic bo = new LoginLogic();
		boolean r = bo.execute(login);
		if( r == true ) {
			path = "WEB-INF/jsp/loginOk.jsp";
		}else {
			path = "WEB-INF/jsp/loginErr.jsp";
		}
		RequestDispatcher dispatcher =
				request.getRequestDispatcher(path);
		dispatcher.forward(request,response);
	}

}
