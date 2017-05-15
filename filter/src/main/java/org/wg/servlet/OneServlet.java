package org.wg.servlet;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class OneServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("OneServlet...");
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
//		response.setCharacterEncoding("gbk");
		String username = request.getParameter("username");
		System.err.println(username);
		response.getWriter().println(username);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		response.setContentType("text/html;charset=gbk");
//		response.setHeader("Content-Type", "text/html;charset=utf-8");
//		request.setCharacterEncoding("utf-8");
//		response.setCharacterEncoding("gbk");
		String username = request.getParameter("username");
//		username = URLEncoder.encode(username, "utf-8");
		System.err.println(username);
		response.getWriter().println(username);
	}
}
