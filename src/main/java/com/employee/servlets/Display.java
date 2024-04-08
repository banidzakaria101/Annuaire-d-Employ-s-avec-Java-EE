package com.employee.servlets;

import java.io.IOException;


public class Display extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Display() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
