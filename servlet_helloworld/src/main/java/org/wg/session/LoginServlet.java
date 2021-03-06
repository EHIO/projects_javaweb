package org.wg.session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        /*
		 * 1. 获取表单数据
		 */
        // 处理中文问题
        request.setCharacterEncoding("utf-8");
        // 获取
        String username = request.getParameter("username");
        String password = request.getParameter("password");
		/*
		 * 2. 校验用户名和密码是否正确
		 */
        if (!"admin".equalsIgnoreCase(username)) {//登录成功
			/*
			 * 附加项：把用户名保存到cookie中，发送给客户端浏览器
			 * 当再次打开login.jsp时，login.jsp中会读取request中的cookie，把它显示到用户名文本框中
			 */
            Cookie cookie = new Cookie("uname", username);//创建Cookie
            cookie.setMaxAge(60 * 60 * 24);//设置cookie命长为1天
            response.addCookie(cookie);//保存cookie
			
			/*
			 * 3. 如果成功
			 *   >  保存用户信息到session中
			 *   >  重定向到succ1.jsp
			 */
            HttpSession session = request.getSession();//获取session
            session.setAttribute("username", username);//向session域中保存用户名
            response.sendRedirect("/servlet/session2/succ1.jsp");
        } else {//登录失败
			/*
			 * 4. 如果失败
			 *   > 保存错误信息到request域中
			 *   > 转发到login.jsp
			 */
            request.setAttribute("msg", "用户名或密码错误!");
            RequestDispatcher qr = request.getRequestDispatcher("/session2/login.jsp");//得到转发器
            qr.forward(request, response);//转发
        }
    }
}
