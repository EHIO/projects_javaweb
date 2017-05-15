package org.wg.listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * HttpSessionListener实现类
 * sessionCreated() -- 在HttpSession对象被创建后被调用
 * sessionDestroyed() --  -- 在HttpSession对象被销毁前调用
 * <p>
 * HttpSessionEvent -- 事件类对象
 * 该类有getSession()，用来获取当前HttpSession对象，即获取事件源对象
 */
public class MyHttpSessionListener implements HttpSessionListener {
    public void sessionCreated(HttpSessionEvent evt) {
        System.out.println("创建session对象");
    }

    public void sessionDestroyed(HttpSessionEvent evt) {
        System.out.println("销毁session对象");
    }
}

