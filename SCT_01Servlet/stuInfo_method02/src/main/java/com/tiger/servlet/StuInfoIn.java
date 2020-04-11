package com.tiger.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.concurrent.ThreadPoolExecutor;

/**
 * 获取请求信息并进行转发
 */
@WebServlet("/stuInfoIn")
public class StuInfoIn extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        //获取表单信息
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        String birthday = req.getParameter("birthday");
        String stuInfo = "我是" + name + "，学号为：" + id + "。今年 "+age+" 岁了。";
        req.getSession().setAttribute("stuInfo", stuInfo);
        //将获取到的信息进行转发，由另一个servlet进行页面信息的输出
        req.getRequestDispatcher("/stuInfoOut").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
