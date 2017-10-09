package org.wg.servlet.forward;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println(request.getAttribute("username"));
        System.out.println("LServlet...");
        response.getWriter().print("hello LServlet!");//设置响应体
    }
}
