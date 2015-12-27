package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.PasswordController;

/**
 * Servlet implementation class password
 */
@WebServlet("/password")
public class password extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public password() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String password = request.getParameter("password");
		String newpassword = request.getParameter("newpassword");
		String renewpassword = request.getParameter("renewpassword");
		HttpSession session  = request.getSession();
		String username = (String) session.getAttribute("username");
		if(username == null){
			//如果不存在的话 跳转到登录界面
			response.sendRedirect("lab/login.jsp");
		}
		if(!newpassword.equals(renewpassword)){
			
		}else{
				PasswordController pwd = new PasswordController();
				int flag = pwd.password(username,password,newpassword);
				switch(flag){
				case 0:
					break;
				case 1:
					response.sendRedirect("lab/success.jsp?reason=密码修改成功啦");
					
					break;
					default:
						break;
				}
		}

	}

}
