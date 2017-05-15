package org.wg.servlet.response;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 演示重定向！
 * @author cxf
 *
 * 用户请求BServlet，然后BServlet响应302,给出Location头
 */
public class BServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("BServlet");
		
		/*
		 * 重定向：
		 * 1. 设置Location
		 * 2. 发送302状态码
		 */
//		response.setHeader("Location", "/servlet/CServlet");
//		response.setStatus(302);
		
		//快捷的重定向方法
//		response.sendRedirect("/servlet/CServlet");//访问本站
		response.sendRedirect("http://www.baidu.com");//访问外站资源
	}
}
