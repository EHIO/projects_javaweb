package org.wg.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
		 * 通过request来获取url的相关方法
		 */
        response.setContentType("text/html; charset=utf-8");
        response.getWriter().print("请求协议:" + request.getScheme() + "<br/>");//获取请求协议
        response.getWriter().print("服务器名称:" + request.getServerName() + "<br/>");//获取服务器名称
        response.getWriter().print("服务器端口号:" + request.getServerPort() + "<br/>");//获取服务器端口号
        response.getWriter().print("项目名称:" + request.getContextPath() + "<br/>");//获取项目名称
        response.getWriter().print("Servlet路径:" + request.getServletPath() + "<br/>");//获取Servlet路径
        response.getWriter().print("参数部分:" + request.getQueryString() + "<br/>");//获取参数部分
        response.getWriter().print("请求URI:" + request.getRequestURI() + "<br/>");//获取请求URI
    }
}
