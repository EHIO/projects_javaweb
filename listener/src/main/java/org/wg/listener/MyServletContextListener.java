package org.wg.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
/**
 * ServletContextListener实现类
 * contextDestroyed() -- 在ServletContext对象被销毁前调用
 * contextInitialized() --  -- 在ServletContext对象被创建后调用
 * 
 * ServletContextEvent -- 事件类对象
 *     该类有getServletContext()，用来获取ServletContext对象，即获取事件源对象
 */

public class MyServletContextListener implements ServletContextListener {
	public void contextDestroyed(ServletContextEvent evt) {
		System.out.println("销毁ServletContext对象");
	}

	public void contextInitialized(ServletContextEvent evt) {
		System.out.println("创建ServletContext对象");
	}
}
