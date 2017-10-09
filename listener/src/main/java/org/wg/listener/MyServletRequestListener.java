package org.wg.listener;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;

/**
 * ServletRequestListener实现类
 * requestDestroyed() -- 在ServletRequest对象被销毁前调用
 * requestInitialized() -- 在ServletRequest对象被创建后调用
 * <p>
 * ServletRequestEvent -- 事件类对象
 * 该类有getServletContext()，用来获取ServletContext对象
 * 该类有getServletRequest()，用来获取当前ServletRequest对象，即事件源对象
 */
public class MyServletRequestListener implements ServletRequestListener {
    public void requestDestroyed(ServletRequestEvent evt) {
        System.out.println("销毁request对象");
    }

    public void requestInitialized(ServletRequestEvent evt) {
        System.out.println("创建request对象");
    }
}
