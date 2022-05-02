package retrievingproduct;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
	
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import retrievingproduct.DBConnection;

/**
 * Servlet implementation class ListData
 */
@WebServlet("/ListData")
public class ListData extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ListData() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String url = "jdbc:mysql://localhost:3307/demoprj";
		String username = "root";
		String password = "root";
		boolean st=false;

		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		try {
			DBConnection db=new DBConnection (url,username,password);
			Connection connection =db.getConnection();
			 
			 Statement st1= connection.createStatement();
			
			 
//			 if(true) {
			 ResultSet set=	 st1.executeQuery("select * from product where id=1");
			 out.print("<h1>Displaying the Product Details...</h1>");
				out.print("<table border='1'><tr><th>Product Id</th><th>Product Name</th><th>Product Price</th></tr>");
	     while(set.next())
			{
		    int id=set.getInt("id");
			String name=set.getNString("name");
			String price=set.getNString("price");
			out.print("<tr><td>");
	    	  out.println(set.getInt(1));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(set.getString(2));
	    	  out.print("</td>");
	    	  out.print("<td>");
	    	  out.print(set.getString(3));
	    	  out.print("</td>");
	    	  out.print("</tr>");
			out.println("data sucessfully feached");
			}
			
			st1.close();
			out.println("</body></html>");
			db.closeConnection();
			} catch (  SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			doGet(request, response);
		}

	}

