package org.wg.response;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 演示定时刷新
 *
 * @author cxf
 *         <p>
 *         设置一个Refresh，它表示定时刷新！
 */
public class DServlet extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
		 * 下面是用来发送响应体！
		 */
//		response.setCharacterEncoding("utf-8");//指定对服务器响应进行重新编码的编码
//		response.setHeader("Content-Type", "text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        writer.print("欢迎XXX登录！5秒钟后会自动跳转到主页！您看到的一定是乱码！");
		/*
		 * 设置名为Refresh的响应头
		 */
        response.setHeader("Refresh", "5;URL=/servlet/response/EServlet");
    }
}
