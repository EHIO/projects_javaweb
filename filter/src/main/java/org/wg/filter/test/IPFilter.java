package org.wg.filter.test;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

/**
 * 从application中获取Map 从request中得到当前客户端的IP 进行统计工作，结果保存到Map中
 * 
 * @author cxf
 * 
 */
public class IPFilter implements Filter {
	private ServletContext application;

	public void init(FilterConfig fConfig) throws ServletException {
		application = fConfig.getServletContext();
		Map<String, Integer> ipCountMap = Collections
				.synchronizedMap(new LinkedHashMap<String, Integer>());
		application.setAttribute("ipCountMap", ipCountMap);
	}

	@SuppressWarnings("unchecked")
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
//		获取请求方的ip
		String ip = req.getRemoteAddr();

		Map<String, Integer> ipCountMap = (Map<String, Integer>) application
				.getAttribute("ipCountMap");
//		得到请求次数
		Integer count = ipCountMap.get(ip);
		if (count == null) {//首次访问，计数为1
			count = 1;
		} else {//非首次，原次数上加一
			count += 1;
		}
//		放入map中
		ipCountMap.put(ip, count);

		application.setAttribute("ipCountMap", ipCountMap);
		chain.doFilter(request, response);
	}

	public void destroy() {
	}
}
