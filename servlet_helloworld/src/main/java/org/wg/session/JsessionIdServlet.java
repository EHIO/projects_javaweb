package org.wg.session;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JsessionIdServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
//		request.getSession();服务器不会马上给你创建session，在第一次获取session时，才会创建！即调用request.getSession();
        response.getWriter().print("请查看是否有jsessionid这个cookie");
    }
}
