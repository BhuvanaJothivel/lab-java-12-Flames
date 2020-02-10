package controller;


import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.FlamesCheckService;

/**
 * Servlet implementation class FlamesCheck
 */
@WebServlet("/flames")
public class FlamesCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlamesCheck() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/check.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name1 = request.getParameter("your");
		String name2 = request.getParameter("crush");
		
		FlamesCheckService fcs = new FlamesCheckService();
					
		char k = fcs.findFlames(name1,name2);
		
				if (k == 'f') {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/friends.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/friends.jsp");
				} else if (k == 'l') {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/lovers.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/lovers.jsp");
				} else if (k == 'a') {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/affection.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/affection.jsp");
				} else if (k == 'm') {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/marriage.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/marriage.jsp");
				} else if (k == 'e') {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/enemies.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/enemies.jsp");
				} else if (k == 's') {
					RequestDispatcher rd=this.getServletContext().getRequestDispatcher("/WEB-INF/views/siblings.jsp");
					rd.forward(request, response);
				//	response.sendRedirect("/WEB-INF/views/siblings.jsp");
				}
	}

}
