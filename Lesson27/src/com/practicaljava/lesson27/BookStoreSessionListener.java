package com.practicaljava.lesson27;

import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSession;
import javax.servlet.ServletConfig;
import javax.servlet.annotation.WebListener;

@WebListener
public class BookStoreSessionListener implements HttpSessionListener{

    public void init(ServletConfig config){
    }

    public void sessionCreated(HttpSessionEvent event){
        HttpSession    session = event.getSession();
        System.out.println("BookStore session created; id:"+ session.getId());
    }

    public void sessionDestroyed(HttpSessionEvent event){
        HttpSession    session = event.getSession();
        System.out.println("BookStore session destroyed; id:"+ session.getId());
    }
}
