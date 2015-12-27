package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.RegisterController;

/**
 * Servlet implementation class register
 */
@WebServlet("/register")
public class register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public register() {
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
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String repassword = request.getParameter("repassword");
		HttpSession session = request.getSession();
		if(password.equals(repassword)){
			   RegisterController  register = new RegisterController();
			    int flag = register.register(username,password);
			    switch(flag){
			    case 0:
			    	// success
			    	session.setAttribute("username", username);
			    	response.sendRedirect("lab/apply.jsp");
			    	break;
			    case 1:
			    	//fail
			    	response.sendRedirect("lab/error.jsp?reason=用户名重复");
			    	break;
			    }
		}else{
			//密码不同
			response.sendRedirect("lab/error.jsp?reason=两次输入的密码不相同");
		}
		
//		System.out.println(username);
//		System.out.println(password);
//		System.out.println(repassword);
	}

}
