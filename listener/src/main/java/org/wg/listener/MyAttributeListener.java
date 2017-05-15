package org.wg.listener;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;
import javax.servlet.ServletRequestAttributeEvent;
import javax.servlet.ServletRequestAttributeListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
/**
 * 当对域属性进行增、删、改时，执行的监听器一共有三个：
	1.ServletContextAttributeListener：在ServletContext域进行增、删、改属性时调用下面方法。
		public void attributeAdded(ServletContextAttributeEvent evt)
		public void attributeRemoved(ServletContextAttributeEvent evt)
		public void attributeReplaced(ServletContextAttributeEvent evt)
	2.HttpSessionAttributeListener：在HttpSession域进行增、删、改属性时调用下面方法
		public void attributeAdded(HttpSessionBindingEvent evt)
		public void attributeRemoved (HttpSessionBindingEvent evt)
		public void attributeReplaced (HttpSessionBindingEvent evt) 
	3.ServletRequestAttributeListener：在ServletRequest域进行增、删、改属性时调用下面方法
		public void attributeAdded(ServletRequestAttributeEvent evt)
		public void attributeRemoved (ServletRequestAttributeEvent evt)
		public void attributeReplaced (ServletRequestAttributeEvent evt)

下面对这三个监听器的事件对象功能进行介绍：
	1. ServletContextAttributeEvent
		String getName()：获取当前操作的属性名；
		Object getValue()：获取当前操作的属性值；
		ServletContext getServletContext()：获取ServletContext对象。
	2. HttpSessionBindingEvent
		String getName()：获取当前操作的属性名；
		Object getValue()：获取当前操作的属性值；
		HttpSession getSession()：获取当前操作的session对象。
	3. ServletRequestAttributeEvent
		String getName()：获取当前操作的属性名；
		Object getValue()：获取当前操作的属性值；
		ServletContext getServletContext()：获取ServletContext对象；
		ServletRequest getServletRequest()：获取当前操作的ServletRequest对象。

 * @author Administrator
 * 演示一个， 其余两个同理
 */
public class MyAttributeListener implements ServletContextAttributeListener,
		ServletRequestAttributeListener, HttpSessionAttributeListener {
	public void attributeAdded(HttpSessionBindingEvent evt) {
		System.out.println("向session中添加属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeRemoved(HttpSessionBindingEvent evt) {
		System.out.println("从session中移除属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeReplaced(HttpSessionBindingEvent evt) {
		System.out.println("修改session中的属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeAdded(ServletRequestAttributeEvent evt) {
		System.out.println("向request中添加属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeRemoved(ServletRequestAttributeEvent evt) {
		System.out.println("从request中移除属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeReplaced(ServletRequestAttributeEvent evt) {
		System.out.println("修改request中的属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeAdded(ServletContextAttributeEvent evt) {
		System.out.println("向context中添加属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeRemoved(ServletContextAttributeEvent evt) {
		System.out.println("从context中移除属性：" + evt.getName() + "="
				+ evt.getValue());
	}

	public void attributeReplaced(ServletContextAttributeEvent evt) {
		System.out.println("修改context中的属性：" + evt.getName() + "="
				+ evt.getValue());
	}
}
