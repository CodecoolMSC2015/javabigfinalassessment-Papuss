package EmployeManagerServer.Login;


import EmployeManagerServer.Server.PersonStoreServerSocket;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet(name = "Login")
public class Login extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        session.setAttribute("searchcrit", "kriteriumok");
        response.sendRedirect("LoginSuccess.jsp");
        PersonStoreServerSocket.CSVReader();

    }


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
