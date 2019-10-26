package Listener;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class MyHttpSessionListener implements HttpSessionListener {
    HttpSessionEvent se;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println( se.getSession() + "创建了！！");

    }

    public String getSession() {

        return se.getSession().toString();
    }
    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("session销毁了！！");
    }
}