package com.employee.servlets;

import java.io.IOException;


@WebServlet("/Delete")
public class Delete extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
    public Delete() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id = request.getParameter("Id");
        Affiche.employeeList.removeIf(emp -> emp.getId().equals(id));
        request.setAttribute("employeeList", Affiche.employeeList);
        this.getServletContext().getRequestDispatcher("/WEB-INF/Display.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
