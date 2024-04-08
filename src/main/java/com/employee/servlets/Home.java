package com.employee.servlets;
import java.io.IOException;

@WebServlet("/Home")
public class Home extends HttpServlet {
    private static final long serialVersionUID = 1L;
   
    public Home() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        forwardToHome(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    private void forwardToHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String homePage = "/WEB-INF/Home.jsp";
        getServletContext().getRequestDispatcher(homePage).forward(request, response);
    }
}
