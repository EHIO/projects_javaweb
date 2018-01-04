package org.wg.request;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet请求方法演示
 */
public class RequestServlet extends HttpServlet {

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String requestURI = request.getRequestURI();
        String requestURL = request.getRequestURL().toString();
        response.getWriter().println("请求URI(Request URI): " + requestURI + "<br>");
        response.getWriter().println("请求URL(Request URL): " + requestURL + "<br>");
        response.getWriter().println("rotocol: " + request.getProtocol() + "<br>");
        response.getWriter().println("项目名称:" + request.getContextPath() + "<br>");
        response.getWriter().println("请求协议(Scheme): " + request.getScheme() + "<br>");
        response.getWriter().println("服务器名称(Server Name): " + request.getServerName() + "<br>");
        response.getWriter().println("服务器端口号(Server Port): " + request.getServerPort() + "<br>");
        response.getWriter().println("Servlet路径(Servlet Path): " + request.getServletPath() + "<br>");
        response.getWriter().println("参数部分(Query String): " + request.getQueryString() + "<br>");
        response.getWriter().println("Server Info: " + getServletConfig().getServletContext().getServerInfo() + "<br>");
        response.getWriter().println("Remote Addr: " + request.getRemoteAddr() + "<br>");
        response.getWriter().println("Remote Host: " + request.getRemoteHost() + "<br>");
        response.getWriter().println("Character Encoding: " + request.getCharacterEncoding() + "<br>");
        response.getWriter().println("Content Length: " + request.getContentLength() + "<br>");
        response.getWriter().println("Content Type: "+ request.getContentType() + "<br>");
        response.getWriter().println("Auth Type: " + request.getAuthType() + "<br>");
        response.getWriter().println("HTTP Method: " + request.getMethod() + "<br>");
        response.getWriter().println("ath Info: " + request.getPathInfo() + "<br>");
        response.getWriter().println("ath Trans: " + request.getPathTranslated() + "<br>");
        response.getWriter().println("Remote User: " + request.getRemoteUser() + "<br>");
        response.getWriter().println("Session Id: " + request.getRequestedSessionId() + "<br>");

        /**
         * 使用Referer请求头，来防盗链
         */
        String referer = request.getHeader("Referer");
        response.getWriter().println("Referer : " + referer + "<br>");
        response.getWriter().println("Accept: " + request.getHeader("Accept") + "<br>");
        response.getWriter().println("Host: " + request.getHeader("Host") + "<br>");
        response.getWriter().println("Accept-Language : " + request.getHeader("Accept-Language") + "<br>");
        response.getWriter().println("Accept-Encoding : " + request.getHeader("Accept-Encoding") + "<br>");
        response.getWriter().println("User-Agent : " + request.getHeader("User-Agent") + "<br>");
        response.getWriter().println("Connection : " + request.getHeader("Connection") + "<br>");
        response.getWriter().println("Cookie : " + request.getHeader("Cookie") + "<br>");
    }
}
