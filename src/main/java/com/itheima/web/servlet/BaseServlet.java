package com.itheima.web.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class BaseServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String uri = req.getRequestURI(); // http://localhost:8080/brand_demo05/brand/selectAll
        int index = uri.lastIndexOf("/");
        String methodName = uri.substring(index + 1);  // 获取方法名

//        System.out.println(method);
        Class<? extends BaseServlet> cls = this.getClass();
        try {
            // 获取方法
            Method method = cls.getMethod(methodName, HttpServletRequest.class, HttpServletResponse.class);
            Object invoke = method.invoke(this, req, resp);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
