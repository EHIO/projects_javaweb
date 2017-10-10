package org.wg.encode;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EncodeServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
		 * 1. 先获取来使用iso-8859-1编码的错误字符串
		 * 2. （iso-8859-1）解码，（使用utf-8）重编
		 */
        response.setContentType("text/html; charset=utf-8");

        String name = request.getParameter("username");
        System.out.println(name);
        byte[] b = name.getBytes("iso-8859-1");
        name = new String(b, "utf-8");

        System.out.println(name);
        response.getWriter().println(name);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
		/*
		 * 1. 在获取参数之前，需要先调用request.setCharacterEncoding("utf-8");
		 * 2. 使用getParameter()来获取参数
		 */
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8"); // 设置响应编码
        String username = request.getParameter("username");
        System.out.println(username);
        response.getWriter().println(username);
    }
}
