package com.priyanshu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index.jsp";
    }
    @RequestMapping("/add")
    //Servlet way req handling
    public String add(HttpServletRequest req, HttpSession session){
        int n1 = Integer.parseInt(req.getParameter("num1"));
        int n2 = Integer.parseInt(req.getParameter("num2"));
        int res = n1+n2;
        session.setAttribute("res",res);
        System.out.println(res);
        return "result.jsp";
    }
}
