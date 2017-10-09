package org.wg.utils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MultipleRequestsServlet2 extends BaseServlet {
    public String fun1(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("MultipleRequestsServlet2.fun1()");
        return "/index.jsp";
    }

    public String fun2(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("MultipleRequestsServlet2.fun2()");
        return "r:/index.jsp";
    }

    public String fun3(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("MultipleRequestsServlet2.fun3()");
        return "f:/index.jsp";
    }

    public String fun4(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("MultipleRequestsServlet2.fun4()");
        return "d:/WEB-INF/files/a.rmvb";
    }
}
