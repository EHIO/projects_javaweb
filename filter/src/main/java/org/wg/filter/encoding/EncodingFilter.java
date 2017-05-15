package org.wg.filter.encoding;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 请求编码处理器
 * @author wg
 *
 */
public class EncodingFilter implements Filter {
	private String charset = "UTF-8";
	@Override
	public void destroy() {}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		response.setContentType("text/html;charset=utf-8");//告诉浏览器用utf-8来解码
//		response.setCharacterEncoding("utf-8");//响应数据使用utf-8来编码
		HttpServletRequest req = (HttpServletRequest) request;
		if(req.getMethod().equalsIgnoreCase("GET")) {
			if(!(req instanceof GetRequest)) {
				req = new GetRequest(req, charset);//处理get请求编码
			}
		} else {
			req.setCharacterEncoding(charset);//处理post请求编码, 请求数据使用charset来解码
		}
		chain.doFilter(req, response);
	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		String charset = fConfig.getInitParameter("charset");
		if(charset != null && !charset.isEmpty()) {
			this.charset = charset;
		}
	}
}
