package com.tiger.stuServlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/stuInfo")
public class StuInfo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //设置编码
        request.setCharacterEncoding("UTF-8");
        //获取请求参数
        String id = request.getParameter("id");
        String name = request.getParameter("name");
        String age = request.getParameter("age");
        String birthday = request.getParameter("birthday");
        //向浏览器输出所获取到的信息
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.write("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>学生信息展示</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "    学号："+id+"<br>\n" +
                "    姓名："+name+"<br>\n" +
                "    年龄："+age+"<br>\n" +
                "    生日："+birthday+"<br>\n" +
                "</body>\n" +
                "</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
