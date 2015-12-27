package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.LoginController;
import DB.Database;

/**
 * Servlet implementation class login
 */
@WebServlet(urlPatterns = "/login", asyncSupported = true)
// 则输出localhost:8080/event/login
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * Default constructor.
	 */
	public login() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		// 打印servlrt监听的位置
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// doGet(request, response);
		// System.out.print("hello world");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		// 将username存储到 session 数据中
		HttpSession session = request.getSession();
		session.setAttribute("username",username);
		
		// System.out.println(username);
		LoginController login = new LoginController();
		int data = login.login(username, password);
		// 跳转
		switch (data) {
		case 0:
			response.sendRedirect("lab/error.jsp?reason=用户名不存在");
			break;
		case 1:
			response.sendRedirect("lab/error.jsp?reason=密码不正确");
			break;
		case 2:
			//跳转到教师端
			response.sendRedirect("lab/apply.jsp");
			break;
		case 3:
			//跳转到管理与端
			response.sendRedirect("lab/add.jsp");
			break;
		default:
			break;

		}

	}

}
