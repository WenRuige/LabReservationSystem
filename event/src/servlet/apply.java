package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Controller.ApplyController;

/**
 * Servlet implementation class apply
 */
@WebServlet("/apply")
public class apply extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public apply() {
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
		request.setCharacterEncoding("UTF-8");		//防止取值乱码
		String time = request.getParameter("time");			//申请时间
		String name = request.getParameter("name");			//实验楼 名称
		String content = request.getParameter("content");	//申请理由
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		
		if(username==null){
			//如果没有值的话跳转到 登录界面
			response.sendRedirect("lab/login.jsp");
		}
		ApplyController apply = new ApplyController();
		int flag = apply.apply(username,name,content,time);
		switch(flag){
		case 0:
			response.sendRedirect("lab/error.jsp?reason=插入失败了");
			break;
		case 1:
			response.sendRedirect("lab/success.jsp?reason=新增数据成功");
			break;
			default :
				
				response.sendRedirect("lab/error.jsp?reason=失败了");
				break;
		}
//		System.out.println(time);
//		System.out.println(name);
//		System.out.println(content);
	}

}
