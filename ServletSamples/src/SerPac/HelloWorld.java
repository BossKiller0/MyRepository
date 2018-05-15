package SerPac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloWorld
 */
@WebServlet("/HelloWorld")
public class HelloWorld extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloWorld() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 response.setContentType("text/html");
	        PrintWriter printWriter  = response.getWriter();
	        printWriter.println("<!DOCTYPE html>\r\n" + 
	        		"<html>\r\n" + 
	        		"<head>\r\n" + 
	        		"<meta charset=\"ISO-8859-1\">\r\n" + 
	        		"<title>This is My HTML</title>\r\n" + 
	        		"<style>\r\n" + 
	        		".button {\r\n" + 
	        		"	font-size: 24px;\r\n" + 
	        		"	color: #fff;\r\n" + 
	        		"	background-color: #4CAF50;\r\n" + 
	        		"	border-radius: 15px;\r\n" + 
	        		"}\r\n" + 
	        		"\r\n" + 
	        		".button:hover {\r\n" + 
	        		"	background-color: #3e8e41\r\n" + 
	        		"}\r\n" + 
	        		"\r\n" + 
	        		".button:active {\r\n" + 
	        		"	background-color: #3e8e41;\r\n" + 
	        		"	box-shadow: 0 5px #666;\r\n" + 
	        		"	transform: translateY(4px);\r\n" + 
	        		"}\r\n" + 
	        		"</style>\r\n" + 
	        		"<script type=\"text/javascript\">\r\n" + 
	        		"	function btclick() {\r\n" + 
	        		"		alert(\"You Clicked Button\");\r\n" + 
	        		"\r\n" + 
	        		"	}\r\n" + 
	        		"</script>\r\n" + 
	        		"</head>\r\n" + 
	        		"<body>\r\n" + 
	        		"	First name:\r\n" + 
	        		"	<input type=\"text\" name=\"fname\">\r\n" + 
	        		"	<br> Last name:\r\n" + 
	        		"	<input type=\"text\" name=\"lname\">\r\n" + 
	        		"	<br> Select Vehicle :\r\n" + 
	        		"	<select>\r\n" + 
	        		"		<option value=\"volvo\">Volvo</option>\r\n" + 
	        		"		<option value=\"saab\">Saab</option>\r\n" + 
	        		"		<option value=\"opel\">Opel</option>\r\n" + 
	        		"		<option value=\"audi\">Audi</option>\r\n" + 
	        		"	</select>\r\n" + 
	        		"	<br> Extra Features\r\n" + 
	        		"	<br>\r\n" + 
	        		"	<select multiple>\r\n" + 
	        		"		<option value=\"volvo\">Music System</option>\r\n" + 
	        		"		<option value=\"saab\">Spoilers</option>\r\n" + 
	        		"		<option value=\"opel\">Rim</option>\r\n" + 
	        		"		<option value=\"audi\">Nos</option>\r\n" + 
	        		"	</select>\r\n" + 
	        		"	<br>\r\n" + 
	        		"	<button class=\"button\" onclick=\"btclick()\">OK</button>\r\n" + 
	        		"</body>\r\n" + 
	        		"</html>");
	        
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
