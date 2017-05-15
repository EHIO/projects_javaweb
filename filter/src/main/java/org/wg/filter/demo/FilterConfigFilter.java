package org.wg.filter.demo;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FilterConfigFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		/*	
		 * FilterConfig的方法
		 * ServletContext getServletContext()：获取ServletContext的方法；
		 * String getFilterName()：获取Filter的配置名称；与<filter-name>元素对应；
		 * String getInitParameter(String name)：获取Filter的初始化配置，与<init-param>元素对应；
		 * Enumeration getInitParameterNames()：获取所有初始化参数的名称。
		 */
		ServletContext sc = filterConfig.getServletContext();
		String filterName = filterConfig.getFilterName();
		String initParameter = filterConfig.getInitParameter("paramName1");
		Enumeration names = filterConfig.getInitParameterNames();
		System.out.println(filterName);
		System.out.println(initParameter);
		while(names.hasMoreElements()) {
			String name = (String)names.nextElement();
			String value = filterConfig.getInitParameter(name);
			System.out.println(name + "--" + value);
		}
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		System.out.println("FilterConfigFilter.doFilter()#start");
		chain.doFilter(request, response);
		System.out.println("FilterConfigFilter.doFilter()#end");
	}

}
