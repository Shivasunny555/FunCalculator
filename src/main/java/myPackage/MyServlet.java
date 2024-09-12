package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class MyServlet
 */
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String[] jokes = {
			 "Why do programmers prefer dark mode? Because light attracts bugs.",
			 "Why do programmers hate nature? It has too many bugs.",
	            "How many programmers does it take to change a light bulb? None, that's a hardware problem.",
	            "Why do Java developers wear glasses? Because they don’t see sharp.",
	            "Why was the JavaScript developer sad? Because he didn’t know how to 'null' his feelings.",
	            "What do you call a programmer from Finland? Nerdic.",
	            "Why do programmers prefer using the terminal? Because it’s a no-bug zone.",
	            "Why did the developer go broke? Because he used up all his cache.",
	            "What is a programmer’s favorite hangout place? The Foo Bar.",
	            "Why did the computer go to the doctor? Because it had a virus."
	    };
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String str1 = request.getParameter("num1");
		String str2 = request.getParameter("num2");
		String str3 = request.getParameter("bt1");
		
		int a = Integer.parseInt(str1);
		int b = Integer.parseInt(str2);
		
		int ans;
		if(str3.equals("1")) ans= a+b;
		else if(str3.equals("2")) ans=a-b;
		else if(str3.equals("3")) ans=a*b;
		else ans=a/b;
		int randomIndex = (int) (Math.random() * jokes.length);
	    String randomJoke = jokes[randomIndex];
		response.sendRedirect("Result.jsp?ans= "+ans+"&joke="+randomJoke);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
