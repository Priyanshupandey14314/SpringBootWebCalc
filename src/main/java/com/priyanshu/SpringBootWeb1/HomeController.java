package com.priyanshu.SpringBootWeb1;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String home(){
        return "index";
    }
    @RequestMapping("/add")
    //Servlet way req handling
    public String add(/*HttpServletRequest req*/@RequestParam("num1") int newName, int num2, Model model){
        System.out.println("In add");
//        int n1 = Integer.parseInt(req.getParameter("num1"));
//        int n2 = Integer.parseInt(req.getParameter("num2"));
        int res = newName+num2;
//        session.setAttribute("res",res);
        model.addAttribute("result", res);
        System.out.println(res);
        return "result";
    }
}
