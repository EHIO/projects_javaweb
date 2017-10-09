package org.wg.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

//		response.setCharacterEncoding("utf-8");//指定对服务器响应进行重新编码的编码
        response.setHeader("Content-Type", "text/html;charset=utf-8");
//		response.setContentType("text/html;charset=utf-8");
        response.getWriter().print("还是乱码！");
    }
}
