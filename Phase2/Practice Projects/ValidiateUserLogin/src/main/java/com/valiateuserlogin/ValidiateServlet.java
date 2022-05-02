package com.valiateuserlogin;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class ValidiateServlet extends HttpServlet {
private static final long serialVersionUID = 1L;

 public ValidiateServlet() {
 super();

 }
protected void doGet(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
String userName = request.getParameter("userName");
String password = request.getParameter("password");
RequestDispatcher rd;
if ("raju".equalsIgnoreCase(userName)&&
"raju@123".equalsIgnoreCase(password)) {
System.out.println("valid user");
rd =
getServletContext().getRequestDispatcher("/Welcome.html");
rd.forward(request,response);
}
else {
System.out.println("Invalid user");
rd =
getServletContext().getRequestDispatcher("/LoginError.html");
rd.forward(request,response);
}
}
protected void doPost(HttpServletRequest request, HttpServletResponse
response) throws ServletException, IOException {
doGet(request, response);
}
}